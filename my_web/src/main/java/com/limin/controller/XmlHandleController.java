package com.limin.controller;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.limin.test.HttpClientTest;


@Controller
public class XmlHandleController {

	
	@RequestMapping("/limin/xml/handleXml")
	public ModelMap handleXml(HttpServletRequest request,HttpServletResponse response){

		  
        PrintWriter out = null;  
        response.setContentType("text/html;charset=UTF-8");  
        FileItemFactory factory = new DiskFileItemFactory();  
        ServletFileUpload upload = new ServletFileUpload(factory);  
        File directory = null;    
        List<FileItem> items = new ArrayList();  
        try {  
            items = upload.parseRequest(request);  
            // 得到所有的文件  
            Iterator<FileItem> it = items.iterator();  
            while (it.hasNext()) {  
                FileItem fItem = (FileItem) it.next();  
                String fName = "";  
                Object fValue = null;  
                if (fItem.isFormField()) { // 普通文本框的值  
                    fName = fItem.getFieldName();  
//                  fValue = fItem.getString();  
                    fValue = fItem.getString("UTF-8");  
                } else { // 获取上传文件的值  
                    fName = fItem.getFieldName();  
                    fValue = fItem.getInputStream();  
                    String name = fItem.getName();  
                    if(name != null && !("".equals(name))) {  
                        name = name.substring(name.lastIndexOf(File.separator) + 1);  
                        directory = new File("abc");    
                        directory.mkdirs();  
                        String filePath = ("abc")+ File.separator + name;  
                        InputStream is = fItem.getInputStream();  
                        FileOutputStream fos = new FileOutputStream(filePath);  
                        byte[] buffer = new byte[1024];  
                        while (is.read(buffer) > 0) {  
                            fos.write(buffer, 0, buffer.length);  
                        }  
                        fos.flush();  
                        fos.close();  
                    }  
                }  
            }  
        } catch (Exception e) {  
            System.out.println("读取http请求属性值出错!");  
//          e.printStackTrace();  
        }  
        // 数据处理  
        try {  
            out = response.getWriter();  
            out.print("{success:true, msg:'接收成功'}");  
            out.close();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
		return null;
	}
	
	
	@RequestMapping("/limin/xml/handleImage")
	public ModelMap handleImage(HttpServletRequest request){
		StringBuffer buff = new StringBuffer();
		try {
			DataInputStream inputStream = new DataInputStream(request.getInputStream());
			buff.append(inputStream.readUTF());
//			String content = buff.toString();
			File file = new File("image.xml");
			file.createNewFile();
			FileOutputStream fop = new FileOutputStream(file);
			byte[] b = new byte[1024];
			while((inputStream.read(b)) != -1){
				fop.write(b);
			}
			inputStream.close();
			fop.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	@ResponseBody
	@RequestMapping("/test/limin/httpClient")
	public String TestHttpClient(String url,String file1,String file2,String path){
		System.out.println("----当前路径---");
		System.out.println(new File(".").getAbsolutePath());
		HttpClientTest httpClientTest = new HttpClientTest();
		
		httpClientTest.test(url, file1, file2, path);
		return "success";
	}
}
