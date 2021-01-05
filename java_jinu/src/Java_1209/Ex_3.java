package Java_1209;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		/*
		 * 1. 글자 받기 2. 숫자인지 문자인지 구분하기 3. 숫자이면 숫자로 변환해서 덧셈 4. 문자이면 숫자가 아닙니다. 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		String str = sc.nextLine();
		String str_s[] = new String[100]; // 배열에 문자저장
		int str_n[] = new int[100]; // 숫자로 변환하기위한 배열선언/초기화
		int sum = 0;
		int cnt = 0;
//		boolean a = str.contains("0") || str.contains("1") || str.contains("2") || str.contains("3")
//				|| str.contains("4") || str.contains("5") || str.contains("6") || str.contains("7") || str.contains("8")
//				|| str.contains("9");
		
		/*배열로 비교하기 코드*/
		String[] n = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		for (int i = 0; i < str.length(); i++) {
			str_s[i] = str.substring(i, i + 1);
			for (int j = 0; j < n.length; j++) {
				if (str_s[i].equals(n[j]) == true) {
					str_n[i] = Integer.parseInt(str_s[i]);
					sum += str_n[i];

				} else {
					cnt++;
				}
//				System.out.println("cnt:"+cnt);
			}
			if (cnt == 10) {
				System.out.println("숫자가 아닙니다.");
				cnt = 0;
			} else if (cnt <= 9) {
				System.out.println("숫자입니다. 더한 값: " + sum);
				cnt = 0;
			}
		}


		/* 내 초기코드 */
//		for (int i = 0; i < str.length(); i++) {
//			str_s[i] = str.substring(i, i + 1);
////			System.out.println(str_s[i]);
//
//			if (a == true) {
//				str_n[i] = Integer.parseInt(str_s[i]);
//				sum += str_n[i];
//				System.out.println("숫자입니다. 더한 값: " + sum);
//			} else {
//				System.out.println("숫자가 아닙니다.");
//				break;
//			}
//
//		}

	}

}
