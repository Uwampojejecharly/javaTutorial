package fr.charly.javaTutorial;

public enum Day {
	
	MATIN(8, "il est l'heure de se lever"),
	MIDI(12, "A table"),
	APRESMIDI(15, "Bon foot"),
	SOIR(22,"Bonne nuit"),
	NUIT(2,"Fais de beau reve");
	
	private int hour;
	private String message;
	
	Day(int hour, String message){
		this.hour = hour;
		this.message  = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public int getHour() {
		return hour;
	}

}
