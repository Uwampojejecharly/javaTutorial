package fr.charly.javaTutorial;

public class User {
	private String lastName;
	private String firstName;
	private String phone;
	private String adress;

	public static class UserBuilder{
		private String lastName = "Nom de famille non définit";
		private String firstName = "Prenom non définit";
		private String phone = "pas de Numéro définit";
		private String adress = "Aucune adresse";
		
		public UserBuilder withLastName(String lastName) {
			this.lastName = lastName;
			return this; 
		}
		public UserBuilder withFirstName(String firstName) {
			this.firstName = firstName;
			return this; 
		}
		public UserBuilder withPhone(String phone) {
			this.phone = phone;
			return this; 
		}
		public UserBuilder withAdress(String adress) {
			this.adress = adress;
			return this; 
		}
		
		public User build(){
			User user = new User();
			user.firstName = firstName;
			user.lastName = lastName;
			user.adress = adress;
			user.phone = phone;
			return user;
		}
		
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAdress() {
		return adress;
	}
	
}
