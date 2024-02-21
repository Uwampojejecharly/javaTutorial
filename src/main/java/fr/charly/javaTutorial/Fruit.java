package fr.charly.javaTutorial;

public abstract class Fruit {
	
	private String name;
	
	public Fruit(String name) {
		this.name = name;
	}
	
	public abstract void taste();
	
	public abstract int getSize();
	
	public abstract boolean hasSeed();
	
	public void miam() {
		System.out.println("Liam mange des fruits et des legumes par jour / Nom du  fruit : " + getName());
	}
	public String  getName() {
		return name;
	}
}
