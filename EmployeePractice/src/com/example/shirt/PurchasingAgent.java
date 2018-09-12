package com.example.shirt;

public class PurchasingAgent {

	public void purchase() {
		shirtReport store = new shirtReport();
		int shirtbuy = 0;
		int cardused = 0;

		if (store.Report(4, 2255) == true) {
			store.shirtStore = store.shirtStore - 1;
			double money = store.cc[cardused].getMoney() - store.shirtCount[shirtbuy].getPrize();
			System.out.println("You bought a " + store.shirtCount[shirtbuy].getDescription() + ", now you have " + money + "U$D in your credit card account to use");
		} else {
			System.out.println("You don't have enough money in your credit card account or the credit card isn't autorized, the shirt cost " + store.shirtCount[shirtbuy].getPrize() + " and you have " + store.cc[cardused].getMoney() + " available");
		}
	}
}
