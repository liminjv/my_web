package com.xmls;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.xmls.util.JaxbDateAdapter;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class TestDate {

	@XmlElement(name = "Zhucedengjiriqi")
    private Date zhucedengjiriqi;
	@XmlJavaTypeAdapter(JaxbDateAdapter.class)
	@XmlElement(name = "insert_t")
	private Date createTime;
	@XmlElement(name = "JianCeKaiShiShiJian")
    private Date jiancekaishishijian;
	@XmlElement(name = "JianCeJieShuShiJian")
    private Date jiancejieshushijian;
	public Date getJiancekaishishijian() {
		return jiancekaishishijian;
	}
	public void setJiancekaishishijian(Date jiancekaishishijian) {
		this.jiancekaishishijian = jiancekaishishijian;
	}
	public Date getJiancejieshushijian() {
		return jiancejieshushijian;
	}
	public void setJiancejieshushijian(Date jiancejieshushijian) {
		this.jiancejieshushijian = jiancejieshushijian;
	}
	public Date getZhucedengjiriqi() {
		return zhucedengjiriqi;
	}
	public void setZhucedengjiriqi(Date zhucedengjiriqi) {
		this.zhucedengjiriqi = zhucedengjiriqi;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
