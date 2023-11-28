package fr.charly.javaTutorial;

class Apple extends Fruit {
	
	public Apple() {
		super("pomme");
	}

	@Override
	public void taste() {
		System.out.println("La pomme a un goût plutot sucré");
	}

	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public boolean hasSeed(){
		return true;
	}
 
}
