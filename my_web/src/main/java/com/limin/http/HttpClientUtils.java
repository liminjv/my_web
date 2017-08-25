package com.limin.http;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPOutputStream;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;


/**
 * 
 * @author hongyong
 * @Description: httpClient工具类
 * @date 2017年6月27日下午7:39:00
 *
 */
public class HttpClientUtils {

	
	public static final Charset CHARSET = Charset.forName("UTF-8");
	
	/**
	 * gzip 压缩方式传文件
	 * @param url
	 * @param path
	 * @param fileName
	 * @return
	 */
	public static Map<String, Object> sendFileByGzip(String url, String path, String fileName){
		Map<String, Object> map = new HashMap<String,Object>();
		boolean flag = false;
		String result = "";
		
		CloseableHttpClient httpClient = HttpClients.createDefault();
		try {
			HttpPost httpPost = new HttpPost(url);
			// 设置请求头
			httpPost.setHeader("Content-Encoding", "gzip");
			
			String filepath = path + "/" + fileName;
			// 获取文件名前缀，临时文件命名用
			String[] split = fileName.split("\\.");
			String filePrefix = split[0];

			// 读取未压缩文件
			FileInputStream fileInputStream = null;
			try {
				fileInputStream = new FileInputStream(filepath);
			} catch (FileNotFoundException e) {
				System.out.println(filepath+"文件不存在");
				e.printStackTrace();
			}
			// 压缩路径+文件名
			String gzFile = path + "/" + filePrefix + ".gz";
			// 生成压缩文件
			File file = new File(gzFile);
			FileOutputStream fileOutputStream = null;
			GZIPOutputStream gzipOutputStream = null;
			try {
				fileOutputStream = new FileOutputStream(file);
				gzipOutputStream = new GZIPOutputStream(fileOutputStream);
				byte[] b = new byte[1024];
				int len = 0;
				while ((len = fileInputStream.read(b)) != -1) {
					gzipOutputStream.write(b, 0, len);
				}
				gzipOutputStream.flush();
			} catch (IOException e) {
				System.out.println("压缩文件出错"+gzFile);
				e.printStackTrace();
			} finally {
				try {
					gzipOutputStream.close();
					fileOutputStream.close();
					fileInputStream.close();
				} catch (IOException e) {
					System.out.println("流关闭出错1");
					e.printStackTrace();
				}
			}
			
			FileInputStream inputStream = null;
			CloseableHttpResponse response = null;
			try {
				// 读取压缩文件
				inputStream = new FileInputStream(gzFile);
				InputStreamEntity entity = new InputStreamEntity(inputStream);
				httpPost.setEntity(entity);
				// 发起请求 并返回请求的响应
				response = httpClient.execute(httpPost);
				
				// 获取响应信息
				map = getResult(response);
			} catch (IOException e) {
				System.out.println("读取压缩文件发送http请求出错");
				e.printStackTrace();
			} finally {
				file.delete();
				try {
					inputStream.close();
					closeResponse(response);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} finally {
			try {
				httpClient.close();
			} catch (IOException e) {
				System.out.println("httpClient关闭错误");
				e.printStackTrace();
			}
		}
		
		map.put("flag", flag);
		map.put("result", result);
		return map;
	}
	
	
	/**
	 * 发送文件
	 * @param url
	 * @param path
	 * @param fileName
	 * @return
	 */
	public static Map<String, Object> sendFile(String url,String path,String fileName){
		Map<String, Object> map = new HashMap<String,Object>();
		boolean flag = false;
		String result = "";
		
		CloseableHttpClient httpClient = HttpClients.createDefault();
		try {
			HttpPost httpPost = new HttpPost(url);

			String filepath = path + "/" + fileName;
			// 读取未压缩文件
			FileInputStream fileInputStream = null;
			try {
				fileInputStream = new FileInputStream(filepath);
			} catch (FileNotFoundException e) {
				System.out.println(filepath+"文件不存在");
				e.printStackTrace();
			}
			CloseableHttpResponse response = null;
			try {
				InputStreamEntity entity = new InputStreamEntity(fileInputStream);
				httpPost.setEntity(entity);
				// 发起请求 并返回请求的响应
				response = httpClient.execute(httpPost);
				
				// 获取响应信息
	            map = getResult(response);
			} catch (IOException e) {
				System.out.println("读取压缩文件发送http请求出错");
				e.printStackTrace();
			} finally {
				try {
					fileInputStream.close();
					closeResponse(response);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} finally {
			try {
				httpClient.close();
			} catch (IOException e) {
				System.out.println("httpClient关闭错误");
				e.printStackTrace();
			}
		}
		
		map.put("flag", flag);
		map.put("result", result);
		return map;
	}
	
	
	/**
	 * httpGet
	 * @param url
	 * @param params
	 * @return
	 */
	public static Map<String, Object> httpGet(String url,Map<String, Object> params){
		Map<String, Object> map = new HashMap<String,Object>();
		
		CloseableHttpClient httpClient = HttpClients.createDefault();
		
		if (params != null && !params.isEmpty()) {
            List<NameValuePair> pairs = new ArrayList<NameValuePair>(params.size());
            for (Entry<String, Object> entry : params.entrySet()) {
                    pairs.add(new BasicNameValuePair(entry.getKey(), entry.getValue().toString()));
            }
            try {
				url += "?" + EntityUtils.toString(new UrlEncodedFormEntity(pairs, CHARSET));
			} catch (ParseException | IOException e) {
				e.printStackTrace();
			}
        }
		HttpGet httpGet = new HttpGet(url);
		CloseableHttpResponse response = null; 
        try {
			response = httpClient.execute(httpGet);
			// 获取响应信息
			map = getResult(response);
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				closeResponse(response);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
        return map;
	}

	
	public static Map<String, Object> httpPost(String url,Map<String, Object> params){
		Map<String, Object> map = new HashMap<String,Object>();
		//创建https
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		CloseableHttpResponse response = null;
		//请求参数处理
		if(params!=null && !params.isEmpty()){
			List<NameValuePair> pairList = new ArrayList<NameValuePair>(params.size());
			for(Entry<String, Object> entry:params.entrySet()){
				NameValuePair pair = new BasicNameValuePair(entry.getKey(), entry.getValue().toString());
				pairList.add(pair);
			}
			httpPost.setEntity(new UrlEncodedFormEntity(pairList,CHARSET));
		}
		try {
			response = httpClient.execute(httpPost);
			map = getResult(response);
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				closeResponse(response);
				httpClient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return map;
	}
	
	
	public static Map<String, Object> httpPostJson(String url,String jsonString){
		Map<String, Object> map = new HashMap<String,Object>();
		//创建https
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		CloseableHttpResponse response = null;
		//请求参数处理
		StringEntity entity = new StringEntity(jsonString, CHARSET);
		entity.setContentEncoding("UTF-8");
		entity.setContentType("application/json");
		httpPost.setEntity(entity);
		try {
			response = httpClient.execute(httpPost);
			map = getResult(response);
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				closeResponse(response);
				httpClient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return map;
	}
	
	
	/**
	 * https 请求
	 * @param url
	 * @param params
	 */
	public static Map<String, Object> https(String url,Map<String, Object> params){
		Map<String, Object> map = new HashMap<String,Object>();
		//创建https
		CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(createSSLConnSocketFactory()).build();
		HttpPost httpPost = new HttpPost(url);
		CloseableHttpResponse response = null;
		//请求参数处理
		if(params!=null && !params.isEmpty()){
			List<NameValuePair> pairList = new ArrayList<NameValuePair>(params.size());
			for(Entry<String, Object> entry:params.entrySet()){
				NameValuePair pair = new BasicNameValuePair(entry.getKey(), entry.getValue().toString());
				pairList.add(pair);
			}
			httpPost.setEntity(new UrlEncodedFormEntity(pairList,CHARSET));
		}
		try {
			response = httpClient.execute(httpPost);
			map = getResult(response);
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				closeResponse(response);
				httpClient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return map;
	}

	private static SSLConnectionSocketFactory createSSLConnSocketFactory() {
		SSLConnectionSocketFactory sslsf = null;
		
		try {
			SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null,new TrustStrategy() {
				
				@Override
				public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
					return false;
				}
			}).build();
			sslsf = new SSLConnectionSocketFactory(sslContext,new HostnameVerifier() {
				
				@Override
				public boolean verify(String hostname, SSLSession session) {
					
					return false;
				}
			});
		} catch (KeyManagementException | NoSuchAlgorithmException | KeyStoreException e) {
			e.printStackTrace();
		}
		
		return sslsf;
	}


	/**
	 * 关闭 response
	 * @param response
	 * @throws IOException
	 */
	private static void closeResponse(CloseableHttpResponse response) throws IOException {
		if(response!=null){
			response.close();
		}
	}


	/**
	 * 获取响应结果
	 * @param response
	 * @return
	 * @throws IOException
	 */
	private static Map<String, Object> getResult(CloseableHttpResponse response) throws IOException {
		Map<String, Object> map = new HashMap<String,Object>();
		boolean flag = false;
		String result = "";
		if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
			flag = true;
		}
		HttpEntity resEntity =  response.getEntity();
		result = (resEntity ==null) ? "" : EntityUtils.toString(resEntity, CHARSET);
		EntityUtils.consume(resEntity);
		map.put("flag", flag);
		map.put("result", result);
		return map;
	}
	
	
	public static void main(String[] args) {
		String url = "http://localhost/test/accept"; 
		TransFile file = new TransFile();
		file.setFileName("abc.xml");
		file.setFileType("xml");
		String s = "sfssddffffffffffffffffffffffff";
		file.setContent(s.getBytes());
		Map<String, Object> map = httpPostJson(url, JSON.toJSONString(file));
		for(Entry<String, Object> entry:map.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}

	}
}
