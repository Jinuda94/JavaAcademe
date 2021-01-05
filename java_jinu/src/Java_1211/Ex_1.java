package Java_1211;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		/*
		 * 1.항개수 받기 2.개수만큼 숫자받기 3.배열넣기 4.연산
		 */
		ArrayList<Integer> num = new ArrayList<Integer>();
		String a = ""; //연산자 받아오는 String
		boolean run = true; //while문 반복 run
		int result = 0; //결과값
		while (run) {
			Scanner sc = new Scanner(System.in);
			System.out.println("항 개수를 입력하세요.");
			int n = sc.nextInt(); //항 개수

			for (int i = 0; i < n; i++) {
				System.out.println((i + 1) + "번째 숫자를 입력하세요.");
				num.add(i, sc.nextInt()); //숫자 받기

				if (i == 0) {
					result = num.get(0);
				} else {
					System.out.println("계산할 연산을 선택하세요.(+,-,*,/)");
					a = sc.next();
					
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
					default:
						System.out.println("연산자를 잘못입력하셨습니다. 다시 입력해주세요.");
						i--;
						continue;
					}
				}

				if (i > 0) {
					System.out.println("계산 결과 값: " + result);
				}

			}

			System.out.println("---------------------------");
			System.out.println("더 사용하시겠습니까? 1.사용 2.종료");
			int run_n = sc.nextInt();
			if (run_n == 2) {
				run = false;
			}

		}

	}

}
