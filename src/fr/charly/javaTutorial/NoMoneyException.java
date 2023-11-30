package fr.charly.javaTutorial;

public class NoMoneyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoMoneyException() {
		super("Attention la balance ne peut pas être négative");
	}

}
