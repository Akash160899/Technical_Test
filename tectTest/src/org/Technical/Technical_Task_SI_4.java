package org.Technical;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Technical_Task_SI_4 {
	
	public static void main(String[] args) {
		
		
		
		ArrayList<String> lis=new ArrayList<>();
		lis.add("Java");
		lis.add("Python");
		lis.add("C++");
		lis.add("Java");
		lis.add("Python");
		System.out.println("before removing duplicates :"+lis);
		
		
		Set<String> dupRemove=new LinkedHashSet<>();
		dupRemove.addAll(lis);
		System.out.println(dupRemove);
		
		
		
		
		
		
	}
	

}
