package Java_1202;

import java.util.Scanner;

public class If_test_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 숫자를 입력하세요.");
		int i = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int j = sc.nextInt();

		int sum = i + j;
		System.out.println("더한 값: " + sum);

		if (sum % 2 == 0) {
			System.out.println("짝수 입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}

	}

}
