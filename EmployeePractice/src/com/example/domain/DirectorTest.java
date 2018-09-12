package com.example.domain;

import java.text.NumberFormat;

public class DirectorTest {

	public static void printDirector() {
		// TODO Auto-generated method stub
		Director Dr = new Director(12, "Susan Wheeler", "099-45-2340",
				120567.36, "Global Marketing", 1000000.00);
		System.out.println("Employee's Id: " + Dr.getEmp_Id());
		System.out.println("Director's name: " + Dr.getEmp_Name());
		System.out.println("Director's Social Security Number: #"
				+ Dr.getEmp_SSN());
		System.out.println("Director's Salary: " + NumberFormat.getCurrencyInstance().format(Dr.getEmp_Salary()));
		System.out.println("Director's Departament's Name: "
				+ Dr.getEmp_deptName());
		System.out.println("Director's Budget: " + NumberFormat.getCurrencyInstance().format(Dr.getEmp_Budget()));
		System.out.println("--------------------------------------------------------");
	}

}
