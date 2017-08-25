package com.xmls;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import sun.misc.BASE64Decoder;

public class XmlToPhoto {
	//http://blog.csdn.net/wf520pb/article/details/2644549
	public static void main(String[] args) {
		System.out.println(new File("src\\main\\java\\com\\demo\\Img.xml").getAbsolutePath());
		outToImage();
	}

	 // XML转成图片  
    public static void outToImage() {  
        File f = new File("src\\main\\java\\com\\demo\\Img.xml");  
        SAXReader reader = new SAXReader();  
        try {  
            Document doc = reader.read(f);  
            byte[] aa = doc.asXML().getBytes() ;  
            System.out.println(new String(aa,"UTF-8"));  
              
            Element root = doc.getRootElement();
            Element image = (Element) root.element("Image");  
            String s_data = image.getText();  
            BASE64Decoder decoder = new BASE64Decoder();  
            byte[] data = decoder.decodeBuffer(s_data);  
              
            FileOutputStream fos = new FileOutputStream("D:\\cert\\71198.jpg");  
            fos.write(data);  
            fos.flush();  
            fos.close();  
              
        } catch (DocumentException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
  
    }  
}
