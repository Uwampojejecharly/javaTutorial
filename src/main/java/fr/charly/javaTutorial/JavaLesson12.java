package fr.charly.javaTutorial;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class JavaLesson12 {

	public static void main(String[] args) {

		Map<String, Integer> ages = new HashMap<>();
		ages.put("charly", 23);
		ages.put("Michel", 55);
		ages.put("bob", 50);

		System.out.println(ages.toString());

		int moyenne = 0;

		for (Entry<String, Integer> element : ages.entrySet()) {
			moyenne += element.getValue();
		}

		System.out.println(moyenne);
	}

}
