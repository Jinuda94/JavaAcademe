package Java_1209;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Re_file_ex1 {

	public static void main(String[] args) {

		try {
			/*파일 객체 생성*/
			File file = new File("C:\\workspace\\Java_jinu\\File_text\\number_2.txt");
			Scanner sc = new Scanner(file); //스캐너로 파일 읽기
			String str = sc.nextLine();
			String sub = "";
			int idx[] = new int [str.length()];
			System.out.println(str);
			for(int i = 0; i<str.length(); i++) {
				sub = str.substring(i,i+1);
				if(sub.equals("+")) {
					int j = 0;
					j++;
					idx[i] = i;
				}
					
			}
			
			for(int i = 0; i<idx.length; i++) {
				System.out.println();
			}
			
			
			
			
			
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}

	}

}
