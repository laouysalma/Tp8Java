package com.example.tp;

public class PayPal implements IPaymentMethod {
	private String email;
	private double balance;

	public PayPal(String email, double balance) {
		this.email = email;
		this.balance = balance;
	}

	@Override
	public boolean pay(double amount) {
		balance += amount;
		System.out.printf("PayPal (%s) : remboursé %.2f, solde %.2f%n", email, amount, balance);
		return true;
	}

	@Override
	public boolean refund(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.printf("PayPal (%s) : payé %.2f, reste %.2f%n", email, amount, balance);
			return true;
		}
		System.out.printf("PayPal (%s) : fond insuffisant (%.2f)<%.2f>%n", email, amount, balance);
		return false;
	}

	@Override
	public String getName() {
		return "PayPal[" + email + "]";
	}

}
