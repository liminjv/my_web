package com.limin.json;

import java.util.List;

public class OneBean {

	private int a;
	private String name;
	private List<TwoBean> list;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<TwoBean> getList() {
		return list;
	}
	public void setList(List<TwoBean> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "OneBean [a=" + a + ", name=" + name + ", list=" + list + "]";
	}
	
}
