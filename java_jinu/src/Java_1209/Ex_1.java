package Java_1209;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		/*
		 * 1.숫자 2개를 받는다. 
		 * 2.둘을 곱해서 짝수 홀수 구분한다.
		 * 3.홀수 일시 반복문 종료
		 */
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		System.out.println("곱한 값이 짝수인지 홀수인지 알수있는 프로그램입니다. 곱한 값이 홀수이면 이 프로그램은 종료되게 되어있습니다.");
		while (run) {
			System.out.println("첫번째 숫자를 입력하세요.");
			int num1 = sc.nextInt();
			System.out.println("두번째 숫자를 입력하세요.");
			int num2 = sc.nextInt();
			int mul = num1 * num2;
			if (mul % 2 == 0) {
				System.out.println("곱한 값: " + mul + "은 짝수입니다.");
			} else {
				System.out.println("곱한 값: " + mul + "은 홀수입니다.");
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
		}

	}

}
