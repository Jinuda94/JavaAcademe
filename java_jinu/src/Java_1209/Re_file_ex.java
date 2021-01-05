package Java_1209;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Re_file_ex {

	public static void main(String[] args) {

		try {
			/* 파일 객체 생성 */
			File file = new File("C:\\workspace\\Java_jinu\\File_text\\number_1.txt");
			Scanner sc = new Scanner(file); // 스캐너로 파일 읽기
			int a[] = new int[1000];
			String b[] = new String[1000];
			int b_n[] = new int[1000];
			String c[] = new String[1000];
			int c_n[] = new int[1000];
			
			
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
//				String array[] = str.split("\\+|-|\\*");
				int count = 0;
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) == '+') {
						count++;
					}					
				}
				
				System.out.println(count);

				c[0] = str;
				
				for(int i = 0; i<count; i++) {
					a[i] = c[i].indexOf("+");
					b[i] = c[i].substring(0, a[i]);
					c[i] = c[i].substring(a[i]+1);
					if(c[i].contains("+")==true) {
						a[i+1] = c[i].indexOf("+");
						b[i+1] = c[i].substring(0, a[i+1]);
						c[i+1] = c[i].substring(a[i+1]+1);
						
						i++;
					}	
								
				}
				for(int i=0; i<=1; i++) {
					System.out.println(a[i]+" "+b[i]+" "+c[i]);
				}
		

//				a[0] = str.indexOf("+");
//				String b = str.substring(0, a[0]);
//				int b_n=Integer.parseInt(b);
//				String c = str.substring(a[0]+1);
//				int a_1 = c.indexOf("+");
//				int c_n=Integer.parseInt(c);
//				System.out.println(a);
//				System.out.println(b);
//				System.out.println(c);
//				System.out.println(b_n);
//				System.out.println(c_n);
//				for(int i=0; i<str.length(); i++) {
//					if(i==a[0]) {
//						int sum= b_n+c_n;
//						System.out.println(sum);
//					}
//				}
//				
//				for(int i=0; i<array.length; i++) {
//					System.out.println(array[i]);
//					
//					
//				}
			}

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}

}
