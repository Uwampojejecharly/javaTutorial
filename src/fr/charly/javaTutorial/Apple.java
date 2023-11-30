package fr.charly.javaTutorial;

class Apple extends Fruit implements PeelFruit {

	public Apple() {
		super("pomme");
	}

	@Override
	public void taste() {
		System.out.println("La pomme a un goût plutôt sucré");
	}

	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public boolean hasSeed() {
		return true;
	}

	@Override
	public boolean isPeeled() {
		return false;
	}

	@Override
	public String getSkinType() {
		return "lisse";
	}

}
