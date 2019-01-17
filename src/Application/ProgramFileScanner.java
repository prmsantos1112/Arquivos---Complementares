package Application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramFileScanner {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\prmsa\\eclipse-workspace_2018-09\\documento.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
