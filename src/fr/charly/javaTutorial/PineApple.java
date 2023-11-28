package fr.charly.javaTutorial;

public class PineApple extends Fruit {
	
	 public PineApple() {
		super("ananas");
	}

	@Override
	public void taste() {
		System.out.println("L'ananas a un goût un peut acide");
		
	}

	@Override
	public int getSize() {
		return 2;
	}

	@Override
	public boolean hasSeed() {
		return false;
	}

}
