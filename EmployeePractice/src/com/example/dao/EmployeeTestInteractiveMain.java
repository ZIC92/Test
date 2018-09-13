package com.example.dao;

import java.util.Scanner;

public class EmployeeTestInteractiveMain {
	public static void main(String[] args) {
		System.out.println("To start press any key");
		Scanner in = new Scanner(System.in);
		EmployeeDAO dao = new EmployeeDAOMemoryImpl();
		boolean close = true;
		if (in.hasNextLine()) {
			if (in.toString() != null) {
				while (close) {
					System.out
							.println("Select your action: \n [A] to ADD an employee -  [U] to UPDATE an employee  -  [D] to DELETE an employee  -  [S] to SEARCH an employee by Id  -  [G] to GET all employees data  -  [C] to CLOSE and exit");
					Scanner c = new Scanner(System.in);
					String cs = c.next();
					if (cs.equals("A")) {
						System.out
								.println("Enter the name of your new Employee: ");
						Scanner name = new Scanner(System.in);
						String names = name.next();
						System.out
								.println("Enter the Last name of your new Employee: ");
						Scanner last = new Scanner(System.in);
						String lasts = last.next();
						System.out
								.println("Enter the Salary of your new Employee: ");
						Scanner salary = new Scanner(System.in);
						String salarys = salary.next();

						Employee addao = new Employee();
						dao.add(addao.save(names, lasts, Double
								.parseDouble(salarys)));

					} else if (cs.equals("G")) {
						dao.getAllEmployees();
					} else if (cs.equals("U")) {
						System.out
								.println("Enter the ID of the employee you want to update: ");
						Scanner id = new Scanner(System.in);
						String ids = id.next();
						System.out.println("Enter the name of your Employee: ");
						Scanner name = new Scanner(System.in);
						String names = name.next();
						System.out
								.println("Enter the Last name of your Employee: ");
						Scanner last = new Scanner(System.in);
						String lasts = last.next();
						System.out
								.println("Enter the Salary of your Employee: ");
						Scanner salary = new Scanner(System.in);
						String salarys = salary.next();

						Employee addao = new Employee();
						dao.update(addao.save(names, lasts, Double
								.parseDouble(salarys)), Integer.parseInt(ids));
					} else if (cs.equals("D")) {
						boolean closeD = true;
						System.out
								.println("Enter the Id of the employee you want to delete: ");
						Scanner id = new Scanner(System.in);
						String ids = id.next();
						dao.findById(Integer.parseInt(ids));
						while (closeD) {
							System.out
									.println("\n Are you sure you want to delete this employee? [Y] for YES or [N] for NO");
							Scanner YorN = new Scanner(System.in);
							String YorNs = YorN.next();
							if (YorNs.equals("Y")) {
								dao.delete(Integer.parseInt(ids));
								System.out.println("\n The employee " + ids
										+ " has been deleted");
								closeD = false;
							} else if (YorNs.equals("N")) {
								System.out.println("\n Great");
								closeD = false;
							} else {
								closeD = true;
							}
						}
					} else if (cs.equals("S")) {
						System.out
								.println("Enter the Id of the employee you want to delete: ");
						Scanner id = new Scanner(System.in);
						String ids = id.next();
						dao.findById(Integer.parseInt(ids));
					} else if (cs.equals("C")) {
						close = false;
					} else {
						System.out.println("The command isn't recognized");
					}
				}
			}
		}
	}
}
