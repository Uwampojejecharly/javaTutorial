package fr.charly.javaTutorial;

public class JavaLesson20 {
	
	public static void main(String[] args) {
		

		User user2 = new User.UserBuilder().withLastName("Belfort").withFirstName("Laurent").build();
		

		User user3 = new User.UserBuilder().withFirstName("Lea").withPhone("010203").withLastName("Doliprane").build();
		
		System.out.println(user3.getLastName());
	}

}
