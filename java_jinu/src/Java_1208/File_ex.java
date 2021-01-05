package Java_1208;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_ex {

	public static void main(String[] args) {
		try {
			/*파일 객체 생성*/
			File file = new File("C:\\workspace\\Java_jinu\\File_text\\file_ex_text.txt");
			Scanner sc = new Scanner(file); //스캐너로 파일 읽기
			while(sc.hasNextLine()) {
				String str = sc.nextLine();
				String array[] = str.split("-| |@");
				for(int i=0; i<array.length; i++) {
					System.out.println(array[i]);
				}
			}
			
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}

	}

}
