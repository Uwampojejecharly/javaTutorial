package fr.charly.javaTutorial;

public class JavaLesson6 {

	public static void main(String[] args) {

		int money = 850;
		int pricePhone = 800;
		boolean hasPhone = false;

		String pseudoss = "Ben,Arnold,Fred,Nino";
		String[] pseudos = pseudoss.split(",");

		sendMessage("La différence est de: " + getResultat(money, pricePhone, hasPhone), 9); // test

	}

	private static void sendMessage(String message, int number) {
		System.out.println(" ceci " + number + " est un message dans la concole: " + message);
	}

	private static int getResultat(int money, int pricePhone, boolean hasPhone) {

		if (money >= pricePhone && !hasPhone) {
			System.out.println("tu peux acheter ce téléphone");
		} else {
			System.out
					.println("tu n'as pas assez d'argent pour acheter ce téléphone et en plus tu as déjà un téléphone");
		}
		return money - pricePhone;

	}

}
