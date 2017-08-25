package com.limin.test;

import java.io.File;
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;



public class HttpClientTest {

	 //file1与file2在同一个文件夹下 filepath是该文件夹指定的路径      
    public void SubmitPost(String url,String filename1,String filename2, String filepath){  
        HttpClient httpclient = HttpClientBuilder.create().build();  
        try {  
	            HttpPost httppost = new HttpPost(url);  
	            FileBody bin = new FileBody(new File(filepath + File.separator + filename1));  
	            FileBody bin2 = new FileBody(new File(filepath + File.separator + filename2));  
	            StringBody comment = new StringBody(filename1,ContentType.TEXT_PLAIN);  
	            MultipartEntityBuilder builder = MultipartEntityBuilder.create();  
	            builder.addPart("file1", bin);//file1为请求后台的File upload;属性      
	            builder.addPart("file2", bin2);//file2为请求后台的File upload;属性  
	            builder.addPart("filename1", comment);//filename1为请求后台的普通参数;属性     
	            httppost.setEntity(builder.build());  
	            HttpResponse response = httpclient.execute(httppost);  
	            int statusCode = response.getStatusLine().getStatusCode();  
	            if(statusCode == HttpStatus.SC_OK){  
	                System.out.println("服务器正常响应.....");  
	                HttpEntity resEntity = response.getEntity();  
	                System.out.println(EntityUtils.toString(resEntity));//httpclient自带的工具类读取返回数据  
	                System.out.println(resEntity.getContent());     
	                EntityUtils.consume(resEntity);  
	            }  
            } catch (ParseException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            } catch (IOException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            } finally {  
                try {   
                    httpclient.getConnectionManager().shutdown();   
                } catch (Exception ignore) {  
                      
                }  
            }  
        }  
    
    public void test(String url,String filename1,String filename2,String filepath){
    	SubmitPost(url, filename1, filename2, filepath);
    }
    
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
          
        HttpClientTest httpPostTest = new HttpClientTest();  
          
//        httpPostTest.SubmitPost("http://127.0.0.1/test/limin/httpClient",  
		httpPostTest.SubmitPost("http://127.0.0.1/limin/xml/handleXml",  
                "Img.xml","test.zip","D://aa");  
    } 
}


//file1与file2在同一个文件夹下 filepath是该文件夹指定的路径      
//public void SubmitPost(String url,String filename1,String filename2, String filepath){  
//    HttpClient httpclient = new DefaultHttpClient();  
//    try {  
//            HttpPost httppost = new HttpPost(url);  
//            FileBody bin = new FileBody(new File(filepath + File.separator + filename1));  
//            FileBody bin2 = new FileBody(new File(filepath + File.separator + filename2));  
//            StringBody comment = new StringBody(filename1);  
//            MultipartEntity reqEntity = new MultipartEntity();  
//            reqEntity.addPart("file1", bin);//file1为请求后台的File upload;属性      
//            reqEntity.addPart("file2", bin2);//file2为请求后台的File upload;属性  
//            reqEntity.addPart("filename1", comment);//filename1为请求后台的普通参数;属性     
//            httppost.setEntity(reqEntity);  
//            HttpResponse response = httpclient.execute(httppost);  
//            int statusCode = response.getStatusLine().getStatusCode();  
//            if(statusCode == HttpStatus.SC_OK){  
//                System.out.println("服务器正常响应.....");  
//                HttpEntity resEntity = response.getEntity();  
//                System.out.println(EntityUtils.toString(resEntity));//httpclient自带的工具类读取返回数据  
//                System.out.println(resEntity.getContent());     
//                EntityUtils.consume(resEntity);  
//            }  
//        } catch (ParseException e) {  
//            // TODO Auto-generated catch block  
//            e.printStackTrace();  
//        } catch (IOException e) {  
//            // TODO Auto-generated catch block  
//            e.printStackTrace();  
//        } finally {  
//            try {   
//                httpclient.getConnectionManager().shutdown();   
//            } catch (Exception ignore) {  
//                  
//            }  
//        }  
//    }  
