package fr.charly.programme;

public class javaLesson3 {

	public static void main(String[] args) {
		
		int money = 850;
		int pricephone = 800;
		boolean hasPhone = false;
		
		if(money >= pricephone && !hasPhone){
			System.out.println("tu peut acheter ce telephone");
			} else {
				System.out.println("tu n'as pas assez d'argent pour acheter ce telephone et en plus tu as deja un telephone");
			}
            int[] numbers = { 12, 7, 19};
			int calcul =( numbers[0] + numbers[1] + numbers[2] ) / numbers.length;
			System.out.println(calcul);
			
			String pseudoss = "Ben,Arnold,Fred,Nino";
			String[] pseudos = pseudoss.split(",");
			System.out.println(pseudos[0]);
			
			int[][] Numbers = {
					{
						5, 7, 9
					},
					{
						3, 2, 1
					},
					{
						9, 4, 2
					}
			};
			
			System.out.print(Numbers[0][2]+ "<--");
	}
}
