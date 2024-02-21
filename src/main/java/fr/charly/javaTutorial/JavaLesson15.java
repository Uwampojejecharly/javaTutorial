package fr.charly.javaTutorial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class JavaLesson15 {

	public static void main(String[] args) {

		File folder = new File("C://Users/Charly/Desktop/dossier1/");

		File file = new File("C://Users/Charly/Desktop/ben.html");

		if (!folder.exists()) {
			folder.mkdir();
		}

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			String line = reader.readLine();

			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		File source = new File("C://Users/Charly/Desktop/ben.html");
		File dest = new File("C://Users/Charly/Desktop/dossier1/ben.html" + source.getName());

		try {
			Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		source.delete();
	}
}
