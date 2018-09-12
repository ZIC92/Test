package com.example.dao;


public class EmployeeDAOMemoryImpl implements EmployeeDAO {
	private static Employee[] empArrayMemory = new Employee[10];

	public void add(Employee emp) {
		for(int i = 0; i < empArrayMemory.length; i++)
		if (empArrayMemory[i] == null) {
			empArrayMemory[i] = emp;
			empArrayMemory[i].setempId(i);
			empArrayMemory[i].SetempName(emp.getempName());
			empArrayMemory[i].SetempLast(emp.getempLast());
			empArrayMemory[i].setempSalary(emp.getempSalary());
			break;
		}
	}

	public void update(Employee emp, int id) {
		empArrayMemory[id] = emp;
		empArrayMemory[id].setempId(id);
		empArrayMemory[id].SetempName(emp.getempName());
		empArrayMemory[id].SetempLast(emp.getempLast());
		empArrayMemory[id].setempSalary(emp.getempSalary());
	}

	public void delete(int id) {
		empArrayMemory[id] = null;
	}

	public Employee findById(int id) {
		System.out.println(empArrayMemory[id].getempId());
		System.out.println(empArrayMemory[id].getempName());
		System.out.println(empArrayMemory[id].getempLast());
		System.out.println(empArrayMemory[id].getempSalary());
		return null;
	}

	public Employee[] getAllEmployees() {
		for (int i = 0; i < empArrayMemory.length; i++) {
			if (empArrayMemory[i] != null) {
				System.out.println(empArrayMemory[i].getempId());
				System.out.println(empArrayMemory[i].getempName());
				System.out.println(empArrayMemory[i].getempLast());
				System.out.println(empArrayMemory[i].getempSalary());
			} else {
				break;
			}
		}
		return null;
	}

}
