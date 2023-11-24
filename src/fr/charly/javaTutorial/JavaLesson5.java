package fr.charly.javaTutorial;

public class JavaLesson5 {

	public static void main(String[] args) {

		int money = 850;
		int pricephone = 800;
		boolean hasPhone = false;

		if (money >= pricephone && !hasPhone) {
			System.out.println("tu peut acheter ce telephone");
		} else {
			System.out
					.println("tu n'as pas assez d'argent pour acheter ce telephone et en plus tu as deja un telephone");
		}
		String pseudoss = "Ben,Arnold,Fred,Nino";
		String[] pseudos = pseudoss.split(",");
		int[] notes = { 12, 17, 18, 20 };
		int calcul = 0;

		for (int i = 0; i <= 100; i++) {
			System.out.println("ceci et le tour de boucle numero" + i);
		}
		for (int note : notes) {
			calcul = calcul + note;
		}
		System.out.println("la moyenne de la  personne est de" + calcul / notes.length);

		int i = 0;

		while (i != 300) {
			i++;
			System.out.println("nino / " + i);
		}
	}
}
