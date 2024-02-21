package fr.charly.javaTutorial;

public class JavaLesson16 {

	public static void main(String[] args) {

		substract(10, 4, new CalculListener() {
			
			@Override
			public void onPositiveResult() {
				System.out.println("c'est bien !");
				
			}
			
			@Override
			public void onNegativeResult() {
				System.out.println("attention");
				
			}
		});

	}

	private static void substract(int a, int b, CalculListener listener) {

		int result = a - b;
		System.out.println("le resultat de cette soustraction est : " + result);

		if (result > 0) {
			System.out.println("le resultat est positif !");
			listener.onPositiveResult();
		}

		else {
			System.out.println("le resultat est negatif !");
			listener.onNegativeResult();
		}
		
	}

}
