package org.Technical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Technical_Task_SI_18 {

	public static void main(String[] args) {

		Map<String, String> dateOfBirth = new HashMap<>();

		dateOfBirth.put("Akash", "16.08.1999");
		dateOfBirth.put("santhosh", "01.02.1997");

		System.out.println(dateOfBirth.entrySet());
		Set<Entry<String, String>> dateOfBirthSet = dateOfBirth.entrySet();
		List<Entry<String, String>> entryList = new ArrayList<Entry<String, String>>(dateOfBirthSet);

		Collections.sort(entryList, new Comparator<Entry<String, String>>() {

			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {

				return o1.getValue().compareTo(o2.getValue());
			}
		});

		LinkedHashMap<String, String> sortedMap = new LinkedHashMap<String, String>();

		for (Entry<String, String> entry : entryList) {

			sortedMap.put(entry.getKey(), entry.getValue());

		}

		for (String year : sortedMap.keySet()) {
			
			System.out.println(sortedMap.get(year));

		}
	}
}
