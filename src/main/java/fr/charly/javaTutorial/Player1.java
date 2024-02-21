package fr.charly.javaTutorial;

public class Player1 {
	private String name;
	private double health;

	public Player1(String name, double health) {
		this.name = name;
		this.health = health;
	}

	public Player1(String name) {
		this(name, 500);
	}

	public String getName() {
		return name;
	}

	public void SendMessage() {
		SendMessage("Vous avez " + health + " points de vie !");
	}

	public void SendMessage(String message) {
		System.out.println(name + " : " + message);
	}

	public double getHealth() {
		return health;
	}

}
