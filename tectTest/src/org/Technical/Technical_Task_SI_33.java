package org.Technical;

import java.util.Arrays;

public class Technical_Task_SI_33 {

	public static void main(String[] args) {

		int arr1[] = new int[] { 1, 2, 3, 4, 5 };
		int arr2[] = new int[] { 6, 7, 8, 9, 10 };
		int arr3[] = new int[arr1.length + arr2.length];
		int arr3Indexposition = 0;

		for (int i = 0; i < arr1.length; i++) {

			arr3[arr3Indexposition] = arr1[i];
			arr3Indexposition++;

		}

		for (int j = 0; j < arr2.length; j++) {

			arr3[arr3Indexposition] = arr2[j];
			arr3Indexposition++;

		}
		
		
		System.out.println(Arrays.toString(arr3));

	}

}
