package Java_1204;

import java.util.Scanner;

public class String_ex {

	public static void main(String[] args) {
		/*
		 * 1.문자를받는다. 2.for문으로 문자를자른다. 3.자른 문자안에 특수기호(#?!)가 있으면 "입력 실수"출력
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력해주세요.(#,?,!의 특수문자 제외)");
		String str = sc.next();
		System.out.println(str);
		int count = 0;
		String b = "";

		for (int i = 0; i < str.length(); i++) {
			String str_s = str.substring(i, i + 1);
			if (str_s.equals("#") || str_s.equals("?") || str_s.equals("!")) {
				count = 1;
				b = str_s;
				System.out.println(str_s + " 잘못된 문자를 입력하셨습니다.");
			} // #?! 특수기호 제외코드
			else {
				count = 0;
				System.out.println(str_s);
			}

		}

		if (count == 1) {
			System.out.println("잘못된 문자를 입력하셨습니다. 잘못 입력한 문자: "+b);
		}

		if (count == 0) {
			System.out.println(str + " 문자를 입력하셨습니다.");
		}

	}

}
