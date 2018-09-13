package com.example.banking;

public class TimeDepositAccount extends Account {
	public TimeDepositAccount(int AccId, int AccCustomerId, String AccCustomerName, String AccDesc,
			double AccBalance) {

	}

	public double getBalance() {
		return this.AccBalance;
	}

	// override methods from the abstract class Account
	public double Withdraw(int w) {
		return this.AccBalance -= w;
	}

	public double Deposit(int d) {
		return this.AccBalance += d;
	}

	public String getDescription() {
		return this.AccDesc;
	}

}
