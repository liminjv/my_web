package com.limin.util;


import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONObject;


/**
 * 常用方法工具类
 * 
 * @author 
 * @version 
 * @see 
 * @since
 */
public class ToolKit
{

	private static Logger logger = Logger.getLogger(ToolKit.class);

    /**
     * 将需要拼接好的字符串传入，返回截取好的字符串
     * 
     * @param str
     * @return
     * @see
     */
    public static String getStrsBySub(String str)
    {
        String reg = "/,$/gi";
        String string = "";
        if (StringUtils.isNotBlank(str))
        {
            str = str.replace(reg, "");
            str = str.substring(0, str.length() - 1);
        }
        string = str;
        return string;

    }


	/**
	 * 向FTP服务器上传文件。
	 * 
	 * @param ftpUrl
	 *        ftp服务器hostname（IP）
	 * @param ftpPort
	 *        ftp服务器端口
	 * @param userName
	 *        ftp服务器登录名
	 * @param password
	 *        ftp服务器登录密码
	 * @param uploadPath
	 *        上传到ftp服务器的位置路径
	 * @param fileName
	 *        上传的文件名称
	 * @param input
	 *        上传的文件输入流
	 * @return boolean 上传成功与否
	 */
	public static boolean ftpUpload(final String ftpUrl, final int ftpPort, final String userName,
			final String password, final String uploadPath, final String fileName, final InputStream input)
	{
		boolean uploadResult = false;
		final FTPClient ftp = new FTPClient();
		try
		{
			int reply;

			// 连接FTP服务器
			ftp.connect(ftpUrl, ftpPort);

			// 如果采用默认端口，可以使用ftp.connect(url)的方式直接连接FTP服务器
			// 登录
			ftp.login(userName, password);

			ftp.enterLocalPassiveMode();
			// 设置FTPClient的传输模式为二进制（默认是ASCII）
			ftp.setFileType(FTP.BINARY_FILE_TYPE);
			reply = ftp.getReplyCode();

			if (!FTPReply.isPositiveCompletion(reply))
			{
				logger.error("链接FTP服务器失败:[" + reply + "]");
				logger.error("ftpUrl:" + ftpUrl + " ftpPort:" + ftpPort + " userName:" + userName + " password:"
						+ password + " uploadPath:" + uploadPath + " fileName:" + fileName);
				final StringBuilder sb = new StringBuilder();
				if (ftp.getReplyStrings() != null) {
					for (final String s : ftp.getReplyStrings()) {
						sb.append(s);
					}
				}
				logger.error(ftp.getReplyString() + " " + sb.toString());
				ftp.disconnect();
			}
			else
			{

				final String[] paths = uploadPath.split("/");

				final StringBuffer sb = new StringBuffer();
				sb.append("/");
				// 循环每级目录
				for (int i = 0; i < paths.length; i++)
				{
					if (!paths[i].equals(""))
					{
						sb.append(paths[i] + "/");

						// 重新拼成目录，
						final String path = sb.toString();

						System.out.println(path + "path");
						// 切换工作目录，如果返回false表示该目录不存在，同时检查每级目录是否已经创建
						if (!ftp.changeWorkingDirectory(path))
						{
							logger.debug("上传路径不存在。开始创建该路径目录...---第" + i + "次创建---...");
							// 创建目录

							if (ftp.makeDirectory(path))
							{
								// 切换到新生成的工作目录
								ftp.changeWorkingDirectory(path);
								logger.debug("创建目录成功。");
							}
							else
							{
								logger.debug("创建目录失败！");
								return uploadResult;
							}
						}
					}
				}

				final boolean result = ftp.storeFile(fileName, input);

				if (result)
				{
					logger.debug("上传文件到FTP服务器成功。");
				}
				else
				{
					logger.debug("上传文件到FTP服务器失败!");
				}

				input.close();
				ftp.logout();
				uploadResult = true;
			}
		} catch (final IOException e)
		{
			logger.error("上传文件到FTP服务器失败!", e);
		} finally
		{
			if (ftp.isConnected())
			{
				try
				{
					ftp.disconnect();
				} catch (final IOException ioe)
				{
					logger.error("关闭FTP服务器连接失败!", ioe);
				}
			}
		}

		return uploadResult;
	}
	
		
		
		
		
		//读取银联的支付文件信息
		public  static Map<String,Object> readylChargesInfo(){
			InputStream is = ToolKit.class.getResourceAsStream("../../../../../acp_sdk.properties"); 
			Properties ps = new Properties();
			//加载properties资源文件
			try {
				ps.load(is);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Map<String,Object> mapyl = new HashMap<String, Object>();
			String merid=ps.getProperty("union.merid");
			mapyl.put("union", merid);
			return mapyl;
		}
		
		
		
		/**
		 * 上传文件
		 * 
		 * @return json格式的通知参数
		 * @throws IOException
		 * @see
		 */
		@SuppressWarnings("rawtypes")
		public static String uploadImg(HttpServletRequest request,String entId) throws IOException {
			// 从系统参数配置表中取出ftp配置

			// 从配置文件中取出FTP路径
			String ftpurl = "FTPurl";
			// 取出FTP端口号
			int ftpport = 28;
			// 取出ftp登录名
			String ftpname = "";
			// 取出ftp密码
			String ftppwd = "";

			// 从配置中取出FTP保存文件路径
			String filePath = "文件保存路径";
			// 从配置中取出图片服务器访问URL
			String url = "图片访问路径";
			// 定义允许上传的文件扩展名
			String[] fileTypes = new String[] { "gif", "jpg", "jpeg", "png", "bmp" };
			// 允许最大上传文件大小
			long maxSize = 1024000;
			// 从配置中取出上传照片最大尺寸
//			String maxSizeString = "设置的文件最大尺寸";

			JSONObject object = new JSONObject();
			int result = 0;

			try {
				DiskFileItemFactory diskFactory = new DiskFileItemFactory();
				// threshold 硬盘缓存 1M
				diskFactory.setSizeThreshold(10 * 1024);
				// repository 临时文件目录
				// diskFactory.setRepository(new File(filePath));

				ServletFileUpload upload = new ServletFileUpload(diskFactory);

				// 设置允许上传的最大文件大小 4M
				// upload.setSizeMax(4 * 1024 * 1024);

				// 解析HTTP请求消息头
				List fileItems = upload.parseRequest(request);

				// 遍历
				Iterator iter = fileItems.iterator();
				while (iter.hasNext()) {
					FileItem item = (FileItem) iter.next();

					// 处理文件内容
					if (!item.isFormField()) {
						System.out.println("处理文件 ...");
						String filename = item.getName();
						System.out.println("完整的文件名：" + filename);
						// 扩展名
						String fileExt = filename.substring(
								filename.lastIndexOf(".") + 1).toLowerCase();
						// 时间
						String nowTime = null;
						// 文件名
						String filenewname = null;
						// 保存的url
						String imageUrl = null;
						nowTime = new SimpleDateFormat("ddHHmmss")
								.format(new Date());// 当前时间
//						Random r = new Random();
						filenewname = nowTime + "." + fileExt;
						// 源文件路径
						String path = filePath + "/vtsp_imgs/" + entId + "/"
								+ new SimpleDateFormat("yyyy").format(new Date())
								+ "/"
								+ new SimpleDateFormat("MM").format(new Date())
								+ "/";

						// System.out.println("完整的路径：" + path);
						// 图片上传路径
						imageUrl = url + "/vtsp_imgs/" + entId + "/"
								+ new SimpleDateFormat("yyyy").format(new Date())
								+ "/"
								+ new SimpleDateFormat("MM").format(new Date())
								+ "/" + filenewname;

						if (!Arrays.<String> asList(fileTypes).contains(fileExt)) {
							result = 1;
							object.put("result", result);
							object.put("error", "上传文件只允许gif,jpg,jpeg,png,bmp的图片!");
							return object.toString();
						}

						if (item.getSize() > maxSize) {
							result = 2;
							object.put("result", result);
							object.put("error", "上传的文件大小超出" + maxSize + "大小限制！");
							// object.put("error","上传文件大小超过限制!");
							return object.toString();
						}
						try {
							// 得到文件流
							InputStream is = item.getInputStream();

							// 设置上传文件目录
							if (filePath != null && !filePath.equals("")) {
								// 上传源文件
								ToolKit.ftpUpload(ftpurl, ftpport, ftpname, ftppwd,
										path, filenewname, is);
							}
							// 成功则输出保存的url
							result = 3;
							object.put("result", result);
							object.put("photoPath", "http://" + imageUrl);
							return object.toString();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}

			} catch (Exception e) {
				System.out.println("使用 fileupload 包时发生异常 ...");
				e.printStackTrace();
			}
			return object.toString();
		}
}
