package Application;

import java.io.File;
import java.util.Scanner;


public class ProgramCaminhosArquivosPastas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Folder Path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);
		System.out.println("Enter a Folder getPath: " + path.getPath());
		System.out.println("Enter a Folder getParent: " + path.getParent());
		System.out.println("Enter a Folder getName: " + path.getName());

		sc.close();
	}
}
