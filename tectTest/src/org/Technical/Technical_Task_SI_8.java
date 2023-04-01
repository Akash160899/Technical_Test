package org.Technical;

public class Technical_Task_SI_8 {

	public void empName(String name) {
		System.out.println("name of employee is :" + name);

	}

	public void empName(String name, int age) {
		System.out.println("Employee name is :" + name + "\n" + "Age of employee is :" + age);

	}
	
	
	public static void main(String[] args) {
		
		
		Technical_Task_SI_8 load=new Technical_Task_SI_8();
		load.empName("AKASH");
		load.empName("Santhosh", 22);
		
	}

}
