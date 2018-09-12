package com.example.dao;

public class Employee {
	private int empId;
	private String empName;
	private String empLast;
	private double empSalary;

	private static Employee[] empArray = new Employee[10];

	public Employee save(String name, String last, double salary) {
		int empCount = 0;
		empArray[empCount] = new Employee();
		for (int i = 0; i < empArray.length; i++ ){
			if (empArray[i].getempName() == null) {
				empCount = i;
				break;
			}
		}

		empArray[empCount].setempId(empCount);
		empArray[empCount].SetempName(name);
		empArray[empCount].SetempLast(last);
		empArray[empCount].setempSalary(salary);
		return empArray[empCount];

	}

	public void delete() {
		for (int i = 0; i < empArray.length; i++) {
			empArray[i] = null;
		}
	}

	public static Employee findById(int id) {
		return empArray[id];
	}

	public static Employee[] getAllEmployees() {
		return empArray;
	}

	public void setempId(int empId) {
		this.empId = empId;
	}

	public int getempId() {
		return empId;
	}

	public void SetempName(String empName) {
		this.empName = empName;
	}

	public String getempName() {
		return empName;
	}

	public void SetempLast(String empLast) {
		this.empLast = empLast;
	}

	public String getempLast() {
		return empLast;
	}

	public void setempSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public double getempSalary() {
		return empSalary;
	}

	public static void setEmpArray(Employee[] empArray) {
		Employee.empArray = empArray;
	}

	public static Employee[] getEmpArray() {
		return empArray;
	}

}
