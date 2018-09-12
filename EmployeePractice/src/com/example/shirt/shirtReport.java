package com.example.shirt;

public class shirtReport {
	public int shirtStore = 10;
	public int ccn = 10;
	public Shirt[] shirtCount = new Shirt[shirtStore];
	public CreditCard[] cc = new CreditCard[ccn];

	public boolean Report(int shirtNumber, int cardNumber) {
		boolean canbuy = false;
		for (int i = 0; i < this.shirtCount.length; i++) {
			shirtCount[i] = new Shirt();
			shirtCount[i].setId(i + 1);
			cc[i] = new CreditCard();
			int rc = (int) (java.lang.Math.random() * 10);
			int rt = (int) (java.lang.Math.random() * 10);
			int rs = (int) (java.lang.Math.random() * 10);
			int rp = (int) (java.lang.Math.random() * 10);
			int cm = (int) (java.lang.Math.random() * 10);
			int ca = (int) (java.lang.Math.random() * 2);
			cc[i].setNumber((int) (java.lang.Math.random() * 9999));
			if (rc <= 3) {
				shirtCount[i].setDescription("Black");
				shirtCount[i].setColor("Black");
			} else if (rc <= 6 && rc > 3) {
				shirtCount[i].setDescription("Blue");
				shirtCount[i].setColor("Blue");
			} else {
				shirtCount[i].setDescription("Red");
				shirtCount[i].setColor("Red");
			}
			if (rt <= 5) {
				shirtCount[i].setDescription("Polo ");
			} else {
				shirtCount[i].setDescription("T-");
			}
			shirtCount[i].setDescription(shirtCount[i].getDescription()
					+ "Shirt");
			if (rs <= 2) {
				shirtCount[i].setSize("XL");
			} else if (rs >= 3 && rs < 5) {
				shirtCount[i].setSize("L");
			} else if (rs <= 5 && rs > 8) {
				shirtCount[i].setSize("M");
			} else if (rs == 8) {
				shirtCount[i].setSize("S");
			} else {
				shirtCount[i].setSize("XS");
			}
			if (rp <= 2) {
				shirtCount[i].setPrize(25.00);
			} else if (rp >= 3 && rp < 5) {
				shirtCount[i].setPrize(35.00);
			} else if (rp <= 5 && rp > 8) {
				shirtCount[i].setPrize(59.99);
			} else {
				shirtCount[i].setPrize(99.99);
			}
			if (i == shirtNumber) {
				cc[i].setMoney(250.00);
				cc[i].setNumber(cardNumber);
				cc[i].setAutorized(true);
			}
			if (cm <= 2) {
				cc[i].setMoney(10.00);
			} else if (cm >= 3 && cm < 5) {
				cc[i].setMoney(50.00);
			} else if (cm <= 5 && cm > 8) {
				cc[i].setMoney(80.00);
			} else {
				cc[i].setMoney(250.00);
			}
			if (ca == 1) {
				cc[i].setAutorized(true);
			} else {
				cc[i].setAutorized(false);
			}

			System.out.println("Shirt ID: " + shirtCount[i].getId());
			System.out
					.println("Description: " + shirtCount[i].getDescription());
			System.out.println("Color: " + shirtCount[i].getColor());
			System.out.println("Size: " + shirtCount[i].getSize() + "\n");

			System.out.println("Card money: " + cc[i].getMoney());
			System.out.println("Card number: " + cc[i].getNumber());
			System.out.println("Card autorized: " + cc[i].isAutorized() + "\n");


			if (shirtStore > 0 && cc[i].isAutorized()
					&& cc[i].getMoney() >= shirtCount[i].getPrize()) {
				canbuy = true;
			} else {
				canbuy = false;
			}

		}

		if (canbuy) {
			return true;
		} else {
			return false;
		}
	}

}