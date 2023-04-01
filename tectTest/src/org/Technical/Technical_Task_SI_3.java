package org.Technical;

public class Technical_Task_SI_3 {

	public static void main(String[] args) {

		String dup = "Autoamtion Tester";

		char[] arr = dup.toCharArray();

		for (int i = 0; i < dup.length(); i++) {

			for (int j = i + 1; j <dup.length(); j++) {

				if (arr[i] == arr[j]) {

					System.out.println("Duplicates founds are :" + arr[j]);
					break;
				}

			}

		}

	}

}
