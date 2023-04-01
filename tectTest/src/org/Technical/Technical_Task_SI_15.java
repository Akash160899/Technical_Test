package org.Technical;

public class Technical_Task_SI_15 {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 1, 2, 4, 5, 6 };
		for (int i = 0; i < arr.length; i++)
			System.out.print("\t" + arr[i]);
		System.out.println();

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					arr[i] = -1;

				}

			}

		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != -1) {

				System.out.print("\t" + arr[i]);

			}
		}

	}

}
