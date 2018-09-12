package com.example.banking;

public abstract class AbstractBankingMain{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bank B = Bank.getInstance();
		Customer C = new Customer();
		Customer C2 = new Customer();
		Customer C3 = new Customer();
		CheckingAccount CA = new CheckingAccount(0, C.getCmsId(), 2500.00, 5000.00);
		CheckingAccount CA2 = new CheckingAccount(1, C2.getCmsId(), 2500.00, -5000.00);
		CheckingAccount CA3 = new CheckingAccount(2, C3.getCmsId(), -2500.00, -5000.00);
		C.setCmsId(0);
		C.setCmsName("Jane Lane");
		B.AddCustomer(C);
		C.addAccount(CA);
		C2.setCmsId(1);
		C2.setCmsName("Daria Morgendorfer");
		B.AddCustomer(C2);
		C2.addAccount(CA2);
		C3.setCmsId(2);
		C3.setCmsName("Beavis");
		B.AddCustomer(C3);
		C3.addAccount(CA3);

		String Report = B.GetCustomerReport();

		System.out.println(Report);
	}

}
