package Application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramFileWriterBufferedWriter {

	public static void main(String[] args) {

		String[] lines = new String[] { "-- Good morning", "Good afternoon", "Good night --" };
		String path = "C:\\Users\\prmsa\\eclipse-workspace_2018-09\\Documento1.txt";

		// Com a propriedade true o arquivo não é reescrito e sim é acrescentado no final novas linhas;
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
