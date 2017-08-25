package com.limin.Demo;





public class Demo {

	
	public static void main(String[] args) throws InterruptedException {
			
		long test2 = test2();
		long test1 = test1();
		System.out.println("test1:"+test1);
		System.out.println("test2:"+test2);
		
	}

	private static long test1() {
		long start = System.currentTimeMillis();
		String[][] data = new String[1000][1000];
		for(int i=0;i<1000;i++){
			for(int j=0;j<1000;j++){
				data[i][j] = fun(i,j);
			}
		}
		data = null;
		long end = System.currentTimeMillis();
		return end - start;
	}

	private static long test2() {
		long start = System.currentTimeMillis();
		String[][] data = new String[1000][1000];
		for(int i=0;i<500;i++){
			for(int j=0;j<500;j++){
				data[i][j] = fun(i,j);
				data[i][999-j] = fun(i,999-j);
				data[999-i][j] = fun(999-i,j);
				data[999-i][999-j] = fun(999-i,999-j);
			}
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	private static String fun(int i, int j) {
		return i+","+j;
	}
}
