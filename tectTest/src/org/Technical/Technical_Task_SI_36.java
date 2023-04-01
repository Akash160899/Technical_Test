package org.Technical;

public class Technical_Task_SI_36 {

	public static void main(String[] args) {

		// Lets print first fibonacci series..

		int f = 0;
		int s = 1;
		System.out.print(f + " " + s+" ");

		for (int i = 2; i <= 10; i++) {

			int t = f + s;

			System.out.print(t + " ");

			f = s;
			s = t;

		}

	}

}
