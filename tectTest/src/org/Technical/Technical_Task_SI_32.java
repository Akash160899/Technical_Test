package org.Technical;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Technical_Task_SI_32 {

	public static void main(String[] args) {

		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("Java");
		arrList.add("python");
		arrList.add("Java");
		arrList.add("C++");

		Set<String> names = new HashSet<>();
		for (String lis : arrList) {

			if (names.add(lis) == false) {
				System.out.println(lis);

			}

		}

	}

}
