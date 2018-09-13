package com.example.domain;

import java.text.NumberFormat;

public class Employee {
	private int Emp_Id;
	private String Emp_Name;
	private String Emp_SSN;
	private double Emp_Salary;

	public Employee(int Emp_Id, String Emp_Name, String Emp_SSN,
			double Emp_Salary) {
		this.Emp_Id = Emp_Id;
		this.Emp_Name = Emp_Name;
		this.Emp_SSN = Emp_SSN;
		this.Emp_Salary = Emp_Salary;
	}

	public int getEmp_Id() {
		return Emp_Id;
	}

	public void setEmp_Name(String emp_Name) {
		Emp_Name = emp_Name;
	}

	public String getEmp_Name() {
		return Emp_Name;
	}

	public String getEmp_SSN() {
		return Emp_SSN;
	}

	public void raiseSalary(double increase) {
		Emp_Salary += increase;
	}

	public double getEmp_Salary() {
		return Emp_Salary;
	}

	public String toString() {
		return "Employee's Id: " + getEmp_Id() + "\n" +
			   "Employee's Name: " + getEmp_Name() + "\n" +
			   "Employee's SSN: " + getEmp_SSN() + "\n" +
			   "Employee's Salary: " + NumberFormat.getCurrencyInstance().format(getEmp_Salary());
	}

	
}
