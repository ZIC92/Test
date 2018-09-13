package com.example.domain;

import java.text.NumberFormat;

public class AdminTest {

	/**
	 * @param args
	 */
	public static void printAdmin() {
		// TODO Auto-generated method stub
		Admin adm = new Admin(304, "Bill Monroe", "108-23-6509", 75002.34);
		System.out.println("Employee's Id: " + adm.getEmp_Id());
		System.out.println("Admin's name: " + adm.getEmp_Name());
		System.out.println("Admin's Social Security Number: #"
				+ adm.getEmp_SSN());
		System.out.println("Admin's Salary: " + NumberFormat.getCurrencyInstance().format(adm.getEmp_Salary()));
		System.out.println("--------------------------------------------------------");
	}

}
