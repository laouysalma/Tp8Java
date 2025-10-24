package com.example.tp;
public class CreditCard implements IPaymentMethod {
	private String number;
	private String holder;
	private double balance;

	public CreditCard(String number, String holder, double balance) {

		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	@Override
	public boolean pay(double amount) {

		if (amount <= balance) {
			balance -= amount;
			System.out.printf("CreditCard (%s) : payé %.2f, reste %.2f%n", holder, amount, balance);
			return true;
		} else
			System.out.printf("CreditCard (%s) :sode inssufisant (%.2f)<%.2f>%n", holder, amount, balance);
		return false;
	}

	@Override
	public boolean refund(double amount) {
		balance += amount;
		System.out.printf("CreditCard (%s) : remboursé %.2f, solde %.2f%n", holder, amount, balance);
		return true;
	}

	@Override
	public String getName() {
		return "CreditCard[" + holder + "]";
	}
}
