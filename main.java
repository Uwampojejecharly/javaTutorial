package fr.charly.programme;

public class main {

	public static void main(String[] args) {
		
		String pseudo  = "charly";
		int age = 16;
		
		System.out.println(pseudo+ " " +age);
		age += 10;
		System.out.println(pseudo+ " " +age);
		
		int note1 = 10;
		int note2 = 20;
		int note3 = 4;
		
		int calcul = (note1 + note2 + note3) /3;
		System.out.println(calcul);

	}

}
