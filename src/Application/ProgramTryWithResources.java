package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramTryWithResources {

	public static void main(String[] args) {

		String path = "C:\\Users\\prmsa\\eclipse-workspace_2018-09\\documento.txt";

		try (BufferedReader bufered = new BufferedReader(new FileReader(path))) {
			String line = bufered.readLine();

			while (line != null) {
				System.out.println(line);
				line = bufered.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
