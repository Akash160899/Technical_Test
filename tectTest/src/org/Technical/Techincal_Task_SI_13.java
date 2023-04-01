package org.Technical;

public class Techincal_Task_SI_13 {

	public static void main(String[] args) {

		String s = "JAVA";
		int count = 0;

		char[] charArr = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {

			for (int j = i + 1; j < s.length(); j++) {

				if (charArr[i]==charArr[j]) {

					System.out.println("duplicates String are :" + charArr[j]);
					count++;
				}

			}

		}
		System.out.println("count of duplicate is :" + count);
	}

}
