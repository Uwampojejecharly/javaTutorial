package fr.charly.javaTutorial;

public class JavaLesson9 {

	public static void main(String[] args) {

		Apple apple = new Apple();
		apple.taste();
		apple.miam();

		PineApple pineApple = new PineApple();
		pineApple.taste();
		pineApple.miam();

		if (!(apple instanceof PeelFruit)) {
			System.out.println("ce fruit n'implémente pas l'interface PeelFruit");
		}

	}

}
