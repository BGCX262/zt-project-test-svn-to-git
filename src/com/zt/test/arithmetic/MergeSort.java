package com.zt.test.arithmetic;


public class MergeSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 5, 2, 3, 1, 6 };
	}

	public static int[] mergeSort(int[] data1, int[] data2) {
		int[] temp = new int[data1.length + data2.length];
		int i = 0, j = 0, iter = 0;
		for (; i < data1.length && j < data2.length;) {
			if (data1[i] <= data2[j]) {
				temp[iter] = data1[i];
				iter++;
				i++;
			} else {
				temp[iter] = data2[j];
				iter++;
				j++;
			}
		}
		for (; i < data1.length; i++, iter++) {
			temp[iter] = data1[i];
		}
		for (; j < data2.length; j++, iter++) {
			temp[iter] = data2[j];
		}
		return temp;
	}
}
