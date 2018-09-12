package com.example.banking;

public class CustomerReport {
	public void getReport(){
		Customer C = new Customer();
		TimeDepositAccount TDA = new TimeDepositAccount(0, 0, null, null, 0);
		System.out.println(C.getCmsName());
		System.out.println(TDA.getDescription());
		System.out.println(TDA.getBalance());
	}
}
