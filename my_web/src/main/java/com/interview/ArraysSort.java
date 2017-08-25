package com.interview;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		int[] arr = {2,34,1,23,15,36,49};
		System.out.println(xuanze(arr));
		System.out.println(maopao(arr));
		System.out.println(Arrays.toString(arr));
		System.out.println(search(arr, 15));
		((ArraysSort)null).xuanze(arr);
	}
	
	//选择排序
	public static String xuanze(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				int temp = arr[i];
				if(arr[i]>arr[j]){
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return Arrays.toString(arr);
	}
	
	public static String maopao(int[] arr){
		int temp = 0;
		for(int i=arr.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(arr[j+1]<arr[j]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return Arrays.toString(arr);
	}
	
	public static int search(int[] arr, int key) {
	       int start = 0;
	       int end = arr.length - 1;
	       while (start <= end) {
	           int middle = (start + end) / 2;
	           if (key < arr[middle]) {
	               end = middle - 1;
	           } else if (key > arr[middle]) {
	               start = middle + 1;
	           } else {
	               return middle;
	           }
	       }
	       return -1;
       }
}
