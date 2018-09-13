package com.example.banking;

public class CheckingAccount extends Account {
	private final double overDraftLimit;

	public CheckingAccount(int AccId, int AccCmsId, double AccBalance) {
		this.overDraftLimit = 0;
	}

	public CheckingAccount(int AccId, int AccCmsId, double AccBalance,
			double AccDraftLimit) {
		this.overDraftLimit = AccDraftLimit;
	}

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public String getDescription() {
		return "Checking Account";
	}

	public double Withdraw(double w) {
		if ((this.getBalance() - w) < this.overDraftLimit) {
			return 0;
		} else {
			return 1;
		}
	}

}
