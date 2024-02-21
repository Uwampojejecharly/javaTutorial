package fr.charly.javaTutorial;

public class JavaLesson10 {

	public static void main(String[] args) {

	for(Day moment : Day.values()) {
		System.out.println("Nous somme actuellement le " + moment.name().toLowerCase() + " il est actuellement : " + moment.getHour()
		+ "h , " + moment.getMessage());
	}

	}

}
