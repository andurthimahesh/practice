package com.jdbc.test;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3 };
		int array1[] = { 4, 5, 6 };
		int i = 0;
		int merge[] = new int[array.length + array1.length];
		for (i = 0; i < array.length; i++) {
			merge[i] = array[i];
		}
		for (int j = 0; j < array1.length; j++) {
			merge[i] = array1[j];
			i++;
		}
		for (int k = 0; k < merge.length; k++) {
			System.out.print(merge[k] + ",");
		}

	}

}
