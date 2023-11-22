package fr.charly.javaTutorial;

public class JavaLesson2 {

	public static void main(String[] args) {
		
		int money = 850;
		int pricephone = 800;
		boolean hasPhone = false;
		
		if(money >= pricephone && !hasPhone){
			System.out.println("tu peut acheter ce telephone");
			} else {
				System.out.println("tu n'as pas assez d'argent pour acheter ce telephone et en plus tu as deja un telephone");
			}

	}

}
