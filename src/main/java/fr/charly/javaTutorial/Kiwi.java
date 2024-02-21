package fr.charly.javaTutorial;

public class Kiwi extends Fruit implements PeelFruit {

	public Kiwi(String name) {
		super("fruit");
	}

	@Override
	public void taste() {
		System.out.println("le goût est plutôt sucré miam miam");

	}

	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public boolean hasSeed() {
		return false;
	}

	@Override
	public boolean isPeeled() {
		return true;
	}

	@Override
	public String getSkinType() {
		return "doux";
	}

}
