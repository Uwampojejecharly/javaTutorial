package fr.charly.javaTutorial;

public class Bank {

	private String name;

	public Bank(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void tranfert(Account sourceAccount, Account targetAccount, int amount) {

		if (sourceAccount.getAmount() >= amount) {
			// transaction est possible
			sourceAccount.removeMoney(amount);
			targetAccount.addMoney(amount);
			System.out.println(sourceAccount.getOwner() + " a envoye " + amount + " " + sourceAccount.getCurrency()
					+ " à " + targetAccount.getOwner());
		} else {
			System.err.println("Transaction impossible ! La " + sourceAccount.getOwner() + " n'a pas les fonds :");
		}

	}
}
