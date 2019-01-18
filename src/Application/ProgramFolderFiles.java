package Application;

import java.io.File;
import java.util.Scanner;

public class ProgramFolderFiles {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Folder Path: ");
		String strPath = sc.nextLine();
		
		// Listar Pastas do Diretório;

		File path = new File(strPath);

		File[] folders = path.listFiles(File :: isDirectory);
		System.out.println("Folders: ");

		for (File folder : folders) {
			System.out.println(folder);

		}
		
		// Listar Arquivos do Diretório;
		
		File[] files = path.listFiles(File :: isFile);
		System.out.println("Files: ");
		
		for (File file : files) {
			System.out.println(file);

		}		
		
		// Criar uma SubPasta;
		
		boolean success = new File(strPath + "\\Dir_Paulo").mkdir();
		System.out.println("Directory Created Successfully !! " + success);
		
		sc.close();
	}

}
