package com.interview;

import java.math.BigInteger;


/**
 * sleep 和 wait的区别
 * @author limin
 * 2017年6月5日
 */
public class SleepAndWait {
	
	/**
	 *  sleep与wait的区别：
	 *  1、sleep来自Thread，wait来自Object
	 *  2、sleep方法没有释放锁（占用CPU），而wait方法释放了锁（不占用资源），使其他线程可以使用同步控制块或者方法
	 *  3、wait、notify、notifyAll只能在同步控制方法或同步代码块里面使用（即与synchronised），而sleep可以在任何地方使用
	 *  4、sleep必须捕获异常，而wait、notify和notifyAll不需要捕获异常
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) {
//		Object.class.wait();
//		BigInteger
		System.out.println(2>>1);
//		Thread.sleep(1000);
	}
}
