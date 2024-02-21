package fr.charly.javaTutorial;

import java.util.ArrayList;

public class JavaLesson11 {

	public static void main(String[] args) {

		ArrayList<String> ArrayList = new ArrayList<>();
		ArrayList.add("Texte");
		ArrayList.add("charly");
		ArrayList.add("bon travail");

		System.out.println(ArrayList);

		if (ArrayList.contains(25)) {
			System.out.println("l'element existe bien");
		}

		System.out.println(ArrayList);

	}

}
