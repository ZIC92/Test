package com.example.domain;

import java.text.NumberFormat;

public class ManagerTest {

	/**
	 * @param args
	 */
	public static void printManager() {
		// TODO Auto-generated method stub
		Manager mag = new Manager(207, "Barbara Johnson", "054-12-2367", 109501.36, "US Marketing");
		System.out.println("Employee's Id: " + mag.getEmp_Id());
		System.out.println("Manager's name: " + mag.getEmp_Name());
		System.out.println("Manager's Social Security Number: #"
				+ mag.getEmp_SSN());
		System.out.println("Manager's Salary: " + NumberFormat.getCurrencyInstance().format(mag.getEmp_Salary()));
		System.out.println("Manager's Departament's Name: " + mag.getEmp_deptName());
		System.out.println("--------------------------------------------------------");
	}

}
