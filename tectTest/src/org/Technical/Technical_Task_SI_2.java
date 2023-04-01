package org.Technical;

public class Technical_Task_SI_2 {

	public static void main(String[] args) {

		String beforeReverse = "Hello This is my reverse program";
		String afterReverse = "";

		for (int i = beforeReverse.length()-1; i >= 0; i--) {

			afterReverse = afterReverse + beforeReverse.charAt(i);
		}

		System.out.println(afterReverse);

	}

}
