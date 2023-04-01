package org.Technical;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Task_SI_N0_11 {

	public static void main(String[] args) throws ParseException {

		// convert a string into date format....

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		String date = "2022-11-16";

		sdf.parse(date);

		System.out.println(sdf.parseObject(date));

	}

}
