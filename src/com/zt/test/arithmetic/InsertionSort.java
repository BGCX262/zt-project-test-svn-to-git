package com.zt.test.arithmetic;

import java.util.Date;

public class InsertionSort {
	public static int[] sort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > key) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = key;
		}

		return arr;

	}

	public static void main(String[] args) {

				
		 int[] arr = sort(sort(new int[]{5,2,3,1,6}));
		 for (int i : arr) {
		 System.out.print(i+"--");
		 }

		 // 初始化
		// 保持 A[i]!=V
		// 终止 A[i]=V 成立,循环结束仍没有V则返回NIL

	}
}
