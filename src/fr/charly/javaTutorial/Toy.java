package fr.charly.javaTutorial;

public class Toy {

	private String name; // nom du jouet
	private int price; // prix du jouet
	private String description; // descriptif du jouet
	private int promo; // promotion du jouet

	public Toy(String name, int price, String desc, int promo) {
		this.name = name;
		this.price = price;
		this.description = desc;
		this.promo = promo;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;

	}

	public String getDesc() {
		return description;
	}

	public int getPromo() {
		return promo;
	}

}
