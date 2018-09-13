package com.example.domain;

public class Director extends Manager {
	private double Emp_budget;

	public Director(int Emp_Id, String Emp_Name, String Emp_SSN,
			double Emp_Salary, String Emp_deptName, double Emp_budget) {
		super(Emp_Id, Emp_Name, Emp_SSN, Emp_Salary, Emp_deptName);
		// TODO Auto-generated constructor stub
		this.Emp_budget = Emp_budget;
	}

	public double getEmp_Budget() {
		return Emp_budget;
	}

	// #Override
	public String toString() {
		return super.toString() + "\nEmployee's Budget: " + getEmp_Budget();
	}
}
