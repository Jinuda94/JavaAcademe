package java_1230;

import java.util.Scanner;

public class Coding_7 {

	public static void main(String[] args) {
		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("입력숫자 수 입력");
		int count = sc.nextInt();
		int num[] = new int[count];
		for (int i = 0; i < count; i++) {
			System.out.println("숫자입력");
			num[i] = sc.nextInt();
			if (i == count - 1) {
				System.out.println("연산자 입력(+-*/)");
				String op = sc.next();
				for (int j = 0; j < count; j++) {
					if (j == 0) {
						result = num[j];
					} else {
						switch (op) {
						case "+":
							result += num[j];
							break;
						case "-":
							result -= num[j];
							break;
						case "*":
							result *= num[j];
							break;
						case "/":
							result /= num[j];
							break;
						}
					}
				}
			}
		} // for문종료
		System.out.println("결과:" + result);

	}
}
