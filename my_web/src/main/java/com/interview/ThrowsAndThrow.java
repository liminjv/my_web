package com.interview;



/**
 * throws 和 throw 区别
 * @author limin
 * 2017年6月9日
 */
public class ThrowsAndThrow {
	/**
	 * throws 和 throw 区别：
	 * 1、throw用于方法体内部，由方法体内的语句处理；throws用于方法声明后面，由方法调用者处理；
	 * 2、throw具体向外抛出异常的动作，抛出一个异常实例；throws表明方法会抛出这种异常，让调用者知道要捕获这个异常；
	 * 3、throw是抛出了异常，执行throw一定会抛出某种异常；throws只是出现某种异常的可能性，并不一定会发生
	 * -----
	 * 程序会在throw语句后立即结束，它后面的语句执行不到
	 */
	
	public static void main(String[] args) {
		String string = finallyAndReturn();
		System.out.println("finallyAndReturn："+string);
	}

	private static String finallyAndReturn() {
		int i = 2;
		try {
			i= i/0;
			System.out.println(i);
			return "try";
		} catch (Exception e) {
			System.out.println(e);
			return "catch";
		}finally{
			System.out.println(i);
//			return "finally";
		}
	}
}
