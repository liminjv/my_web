package com.limin.json;

public class TwoBean {

	private int b;
	private String tName;
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	@Override
	public String toString() {
		return "TwoBean [b=" + b + ", tName=" + tName + "]";
	}
}
