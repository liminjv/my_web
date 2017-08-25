package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.Date;

public class FileCopy {

	 public static long forTransfer(File f1,File f2) throws Exception{
	        long time=new Date().getTime();
	        int length=2097152;
	        FileInputStream in=new FileInputStream(f1);
	        FileOutputStream out=new FileOutputStream(f2);
	        FileChannel inC=in.getChannel();
	        FileChannel outC=out.getChannel();
	        int i=0;
	        while(true){
	            if(inC.position()==inC.size()){
	                inC.close();
	                outC.close();
	                return new Date().getTime()-time;
	            }
	            if((inC.size()-inC.position())<20971520)
	                length=(int)(inC.size()-inC.position());
	            else
	                length=20971520;
	            inC.transferTo(inC.position(),length,outC);
	            inC.position(inC.position()+length);
	            i++;
	        }
	  }
	  
	  
	  public static long forJava(File f1,File f2) throws Exception{
		  long time=new Date().getTime();
		  int length=2097152;
		  FileInputStream in=new FileInputStream(f1);
		  FileOutputStream out=new FileOutputStream(f2);
		  byte[] buffer=new byte[length];
		  while(true){
		   int ins=in.read(buffer);
		   if(ins==-1){
		    in.close();
		    out.flush();
		    out.close();
		    return new Date().getTime()-time;
		   }else
		    out.write(buffer,0,ins);
		  }
		 }
}
