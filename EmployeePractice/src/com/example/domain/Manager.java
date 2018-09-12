package com.example.domain;

public class Manager extends Employee {
	private String emp_deptName;
	private Employee[] emp_Staff;
	private int emp_Count = 0;

	public Manager(int Emp_Id, String Emp_Name, String Emp_SSN, double Salary,
			String Emp_deptName) {
		super(Emp_Id, Emp_Name, Emp_SSN, Salary);
		this.emp_deptName = Emp_deptName;
		emp_Staff = new Employee[20];
	}

	public String getEmp_deptName() {
		return emp_deptName;
	}

	public void setEmp_Count(int emp_CountAux) {
		emp_Count = emp_CountAux;
	}

	public int getEmp_Count() {
		return emp_Count;
	}

	public void addEmployee(Employee emp) {
		if (this.emp_Count < 20) {
			this.emp_Staff[this.emp_Staff.length + 1] = emp;
			this.emp_Count += 1;
		} else {
			System.out
					.println("The number of employees has reached its maximum");
		}
	}

	public void findEmployee(Employee empAux) {
		for (int i = 0; i < this.emp_Staff.length; i++) {
			if (this.emp_Staff[i] == empAux) {
				System.out.println("Employee's Name: "
						+ this.emp_Staff[i].getEmp_Name());
				System.out.println("Employee's Name: "
						+ this.emp_Staff[i].getEmp_Id());
			}
		}
	}

	public void deleteEmployee(Employee empAux) {
		boolean delSuccess = false;
		Employee[] empT_Staff = null;
		int empT_Count = 0;

		for (int i = 0; i < this.emp_Staff.length; i++) {
			if (this.emp_Staff[i] != empAux) {
				empT_Staff[i] = this.emp_Staff[i];
				empT_Count += 1;
			} else {
				delSuccess = true;
			}
		}
		if (delSuccess == true) {
			for (int i = 0; i < this.emp_Staff.length; i++) {
				this.emp_Staff[i] = null;
				this.emp_Count = 0;
			}
			for (int i = 0; i < empT_Staff.length; i++) {
				this.emp_Staff[i] = empT_Staff[i];
				this.emp_Count += 1;
			}
		}

	}

	public void printStaffDetails() {
		for (int i = 0; i < this.emp_Staff.length; i++) {
			if (this.emp_Staff[i].getEmp_Id() == 207) {
				System.out.println(this.emp_Staff[i].getEmp_Name());
			} else {
				System.out.println(this.emp_Staff[i].getEmp_Id());
				System.out.println(this.emp_Staff[i].getEmp_Name());
				System.out.println(this.emp_Staff[i].getEmp_SSN());
				System.out.println(this.emp_Staff[i].getEmp_Salary());
			}
		}
	}

	// #Override
	public String toString() {
		return super.toString() + "\nEmployee's Department's Name: " + getEmp_deptName();
	}


}