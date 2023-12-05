package fr.charly.javaTutorial;

public class Account<T> {

	private String owner;
	private double amount;
	private T currency;

	public Account(String owner, double amount, T currency) {
		this.owner = owner;
		this.amount = amount;
		this.currency = currency;
	}

	public String getOwner() {
		return owner;
	}

	public double getAmount() {
		return amount;
	}

	public T getCurrency() {
		return currency;
	}

	public void addMoney(int amount) {
		this.amount += amount;
	}

	public void removeMoney(int amount) {
		this.amount -= amount;
	}

	public void showBalance() {
		System.out.println("vous avez actuellement" + amount + " " + currency + " sur votre solde !");
	}
}
