package Java_1202;

import java.util.Scanner;

public class W_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 숫자를 입력하세요.");
		int i = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int j = sc.nextInt();
		System.out.println("세번째 숫자를 입력하세요.");
		int k = sc.nextInt();
		System.out.println("네번째 숫자를 입력하세요.");
		int l = sc.nextInt();

		int sum = i + j;
		int sub = k - l;
		int mul = sum * sub;

		System.out.println("더한 값: " + sum);
		System.out.println("뺀 값: " + sub);
		System.out.println("곲한 값: " + mul);

	}

}
