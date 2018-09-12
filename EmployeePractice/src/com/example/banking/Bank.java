package com.example.banking;

public class Bank {
	private Customer[] CmsArray = new Customer[20];
	private int CmsCounter = 0;
	private static final Bank instance = new Bank();

	private Bank() {

	}
	public void AddCustomer(Customer Cms) {
		this.CmsArray[this.CmsCounter] = Cms;
		this.CmsCounter += 1;
	}

	public Customer getCustomer(int CmsId) {
		int CmsGet = 0;
		for (int i = 0; i < this.CmsArray.length; i++) {
			if (this.CmsArray[i].getCmsId() == CmsId) {
				CmsGet = this.CmsArray[i].getCmsId();
				break;
			}
		}
		return this.CmsArray[CmsGet];
	}

	public String GetCustomerReport() {
		String Report = "Bank Customer's Report: ";
		for (int i = 0; i < this.CmsCounter; i++) {
			Report = Report + "\n Customer's Id: " + this.CmsArray[i].getCmsId()
					+ "\n Customer's Name: " + this.CmsArray[i].getCmsName()
					+ "\n Account's Description: "
					+ this.CmsArray[i].getAccount(i).getDescription()
					+ "\n Account Balance: "
					+ this.CmsArray[i].getAccount(i).getBalance();
		}

		return Report;
	}
	public static Bank getInstance() {
		return instance;
	}
}
