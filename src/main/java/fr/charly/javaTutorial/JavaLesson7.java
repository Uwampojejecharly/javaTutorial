package fr.charly.javaTutorial;

public class JavaLesson7 {

	public static void main(String[] args) {

		Player player1 = new Player("charly", 20.0, 300.0);
		System.out.println("name : " + player1.getName());
		player1.setAttack(30);
		System.out.println("vie : " + player1.getHealth());

		Player player2 = new Player("ben", 30.0, 150.0);
		player2.setName("Test");
		player2.damage(player1.getAttack());
		System.out.println("name : " + player2.getName());

	}

}
