package fr.charly.javaTutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaLesson19 {

	public static void main(String[] args) {
		
		// créer une liste qui va stocker les jouets de notre site
		List<Toy> jouets = new ArrayList<>();
		jouets.add(new Toy("LU garu", 15 , " Super jeu de cartes ", 5));
		jouets.add(new Toy("Zebre Figurine", 6 , " Petite figurine du zebrou ", 10));
		jouets.add(new Toy("Izibot Evo", 100 ,"  Petit robot programmable ", 5));
		jouets.add(new Toy("Araignée poluche",30 ," Un super doudou ", 5));
		jouets.add(new Toy("Ligo Star Wars", 120 ," Jeu construisction ", 10));
		jouets.add(new Toy("Bakogan Battle Pack", 20 ," figurine d'action ", 0));
		
		// trier cette liste par rapport au prit du jouet
		Collections.sort(jouets, new PriceComparator());
		
		// Afficher les caracteristiques de chacun de ces jouets
		for(Toy jouet : jouets) {
			System.out.println(jouet.getName() + " - " + jouet.getPrice() + "€" + jouet.getDesc() + "(promo:" + jouet.getPromo() + "%)");
		}
	}

}
