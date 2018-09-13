package com.example.domain;

import java.text.NumberFormat;

public class EngineerTest {

	/**
	 * @param args
	 */
	public static void printEngineer() {
		// TODO Auto-generated method stub
		Engineer Eng = new Engineer(101, "Jane Smith", "012-34-5678", 120345.27);
		System.out.println("Employee's Id: " + Eng.getEmp_Id());
		System.out.println("Engineer's name: " + Eng.getEmp_Name());
		System.out.println("Engineer's Social Security Number: #"
				+ Eng.getEmp_SSN());
		System.out.println("Engineer's Salary: " + NumberFormat.getCurrencyInstance().format(Eng.getEmp_Salary()));
		System.out.println("--------------------------------------------------------");
	}

}
