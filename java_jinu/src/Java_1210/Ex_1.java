package Java_1210;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		/* 알파벳 받아서 charAt으로 자르고 2진법으로 바꾼다. */
		System.out.println("알파벳 입력");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char str_c[] = new char[100]; // charAt으로 자른값을 저장하기위한 char형 배열
		int str_i[] = new int[100]; // 2진수로 변경을 위해 int형으로 저장하기위한 int형 배열
		String str_n[] = new String[100]; // 2진수를 저장하기위한 String형 배열
		String str_ch = ""; // 2진수를 문자로 변경하기위한 String형 변수

		for (int i = 0; i < str.length(); i++) {
			str_c[i] = str.charAt(i);
			System.out.println("자르기: " + str_c[i]);
			str_i[i] = str_c[i];
			System.out.println("숫자변환: " + str_i[i]);
			str_n[i] = Integer.toBinaryString(str_i[i]);
			System.out.println("2진수변환: " + str_n[i]);
			System.out.printf("문자변환: ");
			for (int j = 0; j < str_n[i].length(); j++) {
				str_ch = str_n[i].substring(j, j + 1);
//				System.out.println("다시 자르기" + str_ch[j]);
				if (str_ch.equals("1")) {
					str_ch = "*";
				} else {
					str_ch = "-";
				}

				System.out.printf(str_ch);

			}
			System.out.println();
			System.out.println("------------------------");

		}

	}

}
