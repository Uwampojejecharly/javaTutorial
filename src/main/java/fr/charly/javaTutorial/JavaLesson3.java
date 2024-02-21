package fr.charly.javaTutorial;

public class JavaLesson3 {

	public static void main(String[] args) {

		int money = 2200;

		if (money != 2000 && money != 2100 && money != 3000) {
			System.out.println("oui");
		} else {
			System.out.println("non");
		}

		int age = 11;

		if (age >= 18) {
			System.out.println("oui la personne st majeur");
		} else if (age <= 10) {
			System.out.println("la personne est mineur et elle est tres jeune");
		} else {
			System.out.println("non la personne n'est pas majeur");
		}

		int age1 = 10;

		switch (age1) {
		case 10:
			System.out.println("la personne a 10 ans oh la la elle est jeune");
			break;
		case 11:
			System.out.println("la personne est un peut plus age");
			break;
		default:
			System.out.println("cette age n'a ps de message");
		}

	}

}
