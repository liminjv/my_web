package com.limin.controller;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.limin.util.ToolKit;

public class UploadController {

	//FTP文件上传介绍: http://blog.csdn.net/huanggang028/article/details/41446707
	/**
	 * 原生js文件上传
	 * http://www.cnblogs.com/yuanlong1012/p/5127497.html
	 */
	
	/**
	 * 上传图片
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping("/uploadImg")
	public @ResponseBody String  uploadPoto(HttpServletRequest request) throws IOException{
			//获取车辆单位编号
			// 从系统参数配置表中取出ftp配置
			// 从配置文件中取出FTP路径
			String ftpurl = "";
			// 取出FTP端口号
			int ftpport = 0;
			// 取出ftp登录名
			String ftpname = "";
			// 取出ftp密码
			String ftppwd = "";
			// 从配置中取出FTP保存文件路径
			String filePath = "";
			// 从配置中取出图片服务器访问URL
			String url = "";
			// 定义允许上传的文件扩展名
			String[] fileTypes = new String[] { "gif", "jpg", "jpeg", "png", "bmp" };
			// 允许最大上传文件大小
			long maxSize = 1024000;
			// 从配置中取出上传照片最大尺寸
//			String maxSizeString = "";
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
						String path = filePath + "/vtsp_imgs/"+ "/"
								+ new SimpleDateFormat("yyyy").format(new Date())
								+ "/"
								+ new SimpleDateFormat("MM").format(new Date())
								+ "/";

						// System.out.println("完整的路径：" + path);

						// 图片上传路径
						imageUrl = url + "/vtsp_imgs/" + "/"
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
