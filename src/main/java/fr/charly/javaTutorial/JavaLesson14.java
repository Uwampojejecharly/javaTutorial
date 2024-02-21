package fr.charly.javaTutorial;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class JavaLesson14 {

	public static void main(String[] args) {

		Timer chrono = new Timer();
		chrono.schedule(new TimerTask() {

			int time = 5;

			@Override
			public void run() {

				System.out.println("time : " + time);

				if (time == 5) {
					System.out.println("ATTENTION !");
				}

				if (time == 0) {
					Random r = new Random();
					int alea = r.nextInt(6 - 1) + 1;
					System.out.println("valeur du des : " + alea);
					cancel();
				}
				time--;

			}
		}, 1000, 1000);

	}

}
