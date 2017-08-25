package com.limin.http;

import java.io.Serializable;

/**
 * 海关-东盟通文件传输实体类
 * @author hongyong
 * @Description: TODO
 * @date 2017年6月28日上午11:36:22
 *
 */
public class TransFile {
	
	private String fileName;//文件名
	private String fileType;//文件类型 
	private String dir;//存放目录
	private byte[] content;//内容，经gzip压缩
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public byte[] getContent() {
		return content;
	}
	public void setContent(byte[] content) {
		this.content = content;
	}
}
