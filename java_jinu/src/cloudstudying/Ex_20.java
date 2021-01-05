package cloudstudying;

import java.util.Scanner;

public class Ex_20 {

	public static void main(String[] args) {
		int u_count = 0; // 대문자 카운트
		int l_count = 0; // 소문자 카운트
		Scanner input = new Scanner(System.in);
		System.out.println("입력할 문자열 갯수입력");
		int n = input.nextInt(); // 입력할 문자열 개수
		for (int i = 0; i < n+1; i++) {
			if(i >0) {
			System.out.println("문자 입력");
			}
			String str = input.nextLine(); // 문자열 입력
			for (int j = 0; j < str.length(); j++) {
				char str_c = str.charAt(j);
				if (str_c > 64 && str_c < 91) {
					u_count++;
				} else if (str_c > 96 && str_c < 123) {
					l_count++;
				}
			}
			if(i >0) {
				System.out.println(str + ": " + u_count + " " + l_count);
			}
			
			u_count = 0;
			l_count = 0;
		}

		input.close();

	}

}
