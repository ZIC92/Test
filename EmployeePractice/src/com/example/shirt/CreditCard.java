package com.example.shirt;

public class CreditCard {
	private int number;
	private double money;
	private boolean autorized;
	public void setMoney(double money) {
		this.money = money;
	}
	public double getMoney() {
		return money;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setAutorized(boolean autorized) {
		this.autorized = autorized;
	}
	public boolean isAutorized() {
		return autorized;
	}
}
