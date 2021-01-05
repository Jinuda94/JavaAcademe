package Java_1209;

import java.util.Scanner;

public class Re_ex {

	public static void main(String[] args) {
		/* 1.문자열 받기
		 * 2.문자 특수문자 넣기
		 * 3.split사용
		 * 4.문자로 배열에 담으시오. */

		System.out.println("문자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String Array[] = str.split("-|@|!|#|\\$|\\?");
		
		for(int i=0; i<Array.length; i++) {
			System.out.println(Array[i]);
		}
		
		
		
	}

}
