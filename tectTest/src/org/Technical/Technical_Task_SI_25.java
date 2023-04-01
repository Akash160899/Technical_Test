package org.Technical;

public class Technical_Task_SI_25 {

	// break and continue;

	public static void main(String[] args) {

		int i = 1;

		while (i < 100) {
			System.out.println(i);
			if (i == 4) {
				System.out.println("Contiue");
				i++;
				continue;
			}

			if (i == 10) {
				System.out.println("Break");
				break;
			}

			i++;
		}

	}

}
