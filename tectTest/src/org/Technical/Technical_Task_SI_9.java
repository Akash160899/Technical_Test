package org.Technical;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Technical_Task_SI_9 {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File file=new File("path");
		
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine()) {
			
			System.out.println(sc.nextLine());
		}
		
		
		
	}

}
