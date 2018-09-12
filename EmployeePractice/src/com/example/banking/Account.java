package com.example.banking;

public abstract class Account {
	protected int AccId;
	protected int AccCustomerId;
	protected String AccDesc;
	protected double AccBalance;

	public double Withdraw(double w) {
		return this.AccBalance -= w;
	}

	public double Deposit(double d) {
		return this.AccBalance += d;
	}

	public String getDescription() {
		return this.AccDesc;
	}

	public double getBalance() {
		return this.AccBalance;
	}

	public int getId() {
		return this.AccId;
	}

}
