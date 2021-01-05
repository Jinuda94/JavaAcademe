package Java_1208;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File_ex2 {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\workspace\\Java_jinu\\File_text\\sss.txt");
		File file_1 = new File("C:\\workspace\\Java_jinu\\File_text\\file_ex_text.txt");
		try (FileWriter fileWriter = new FileWriter(file)) {
			Scanner sc = new Scanner(file_1);
			String str = "";
			String array[] = null;
			while (sc.hasNextLine()) {
				str = sc.nextLine();
				array = str.split("-|@");
			}
			
			
			PrintWriter pw = new PrintWriter(fileWriter);
			for (int i = 0; i < array.length; i++) {
				pw.print(array[i]);
			}

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}

}
