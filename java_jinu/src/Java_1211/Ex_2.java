package Java_1211;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		String a = ""; // 연산자 받아오는 String
		boolean run = true; // while문 반복 run
		int result = 0; // 결과값
		int i = 0;
		while (run) {
			if (i == 0) {
				System.out.printf("숫자를 입력:");
				num.add(i, sc.nextInt()); // 숫자 받기
				result = num.get(0);
			} else {
				System.out.println("계산할 연산을 선택하세요.(+,-,*,/,=)");
				a = sc.next();
				if (a.equals("=") != true) {
					System.out.printf("숫자를 입력:");
					num.add(i, sc.nextInt()); // 숫자 받기
				}
				switch (a) {
				case "+":
					result += num.get(i);
					break;
				case "-":
					result -= num.get(i);
					break;
				case "*":
					result *= num.get(i);
					break;
				case "/":
					result /= num.get(i);
					break;
				case "=":
					run = false;
					System.out.println("계산 결과 값: " + result);
					break;
				default:
					System.out.println("연산자를 잘못입력하셨습니다. 다시 입력해주세요.");
					i--;
					continue;
				}
			}

			i++;
		}

	}

}
