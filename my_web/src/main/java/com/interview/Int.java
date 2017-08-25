package com.interview;


/**
 * 面试题：3个int值原地交换，不使用中间变量
 * @author limin
 * 2017年6月2日
 */
public class Int {

	
	public static void main(String[] args) {
//		String string = method3();
		String string = method4();
		System.out.println(string);
//		int a=2;
//		System.out.println("a 非的结果是："+(~a));
	}

	static String method4() {
		int x = 5;
		int y = 8;
		y = x + 0 * (x = y);
		return "x="+x+";y="+y;
	}
	
	static String method1(){
		int x = 5;
		int y = 8;
		x = x+y;
		y = x-y;
		x = x-y;
		return "x="+x+";y="+y;
	}
	
	static String method2(){
		int x = 5;
		int y = 8;
		x = x*y;
		y = x/y;
		x = x/y;
		return "x="+x+";y="+y;
	}
	
	
	static String method3(){
		int x = 5;
		int y = 8;
		x = x^y;
		y = y^x;
		x = x^y;
		return "x="+x+";y="+y;
	}
}
