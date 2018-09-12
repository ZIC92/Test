package com.example.domain;

import java.text.NumberFormat;
import com.example.business.EmployeeStockPlan;

public class EmployeeTest {

	// Example of println, creating methods, classes, using parameters and
	// NumberFormat
	public static void printEmployee(Employee emp) {
		// #printEmployee's data
		System.out.println("Employee's Salary: "
				+ NumberFormat.getCurrencyInstance()
						.format(emp.getEmp_Salary()));
	}

	public static void printEmployeeAll() {
		// #printEmployee's data from other classes methods
		AdminTest.printAdmin();
		DirectorTest.printDirector();
		EngineerTest.printEngineer();
		ManagerTest.printManager();
	}

	// Example of Array of objects and some operators

	public static void addEmployee(Employee emp, Manager mag) {
		// #addEmployee

		mag.addEmployee(emp);
		printStaff(mag);
	}

	public static void findEmployee(Employee emp, Manager mag) {
		// #findEmployee
		mag.findEmployee(emp);
		printStaff(mag);
	}

	public static void deleteEmployee(Employee emp, Manager mag) {
		// #deleteEmployee
		mag.deleteEmployee(emp);
		printStaff(mag);
	}

	public static void printStaff(Manager Mg) {
		// #printStaffDetails.
		Mg.printStaffDetails();
	}

	// Example of toString()
	public static void printEmployeeFromtoString(Employee emp) {
		// #printEmployee's data
		System.out.println(emp.toString());
	}

	// Example of overload
	public static void printEmployeeBusiness(Employee emp, EmployeeStockPlan esp) {
		// #printEmployee's data with employee stock method from another package
		printEmployee(emp);
		System.out.println("Employee's Type: " + emp.getClass().getSimpleName());
		System.out.println(emp.toString());
		System.out.println("Stock Options: " + esp.grantStock(emp));
	}

}
