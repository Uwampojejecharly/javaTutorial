package fr.charly.javaTutorial;

public class JavaLesson18 {

	public static void main(String[] args) {

		Account myAccount = new Account("Charly", 100, '$');
		myAccount.showBalance();

		Account otherAccount = new Account("Bob", 10, '$');
		otherAccount.showBalance();

		Bank bank = new Bank("CharlyBank");
		bank.tranfert(myAccount, otherAccount, 25);

		myAccount.showBalance();
		otherAccount.showBalance();

	}

}
