package Java_1209;

import java.util.Scanner;

public class Calculator_Array_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int result_a[] = new int[1000];
		boolean run = true;
		int i = 0;
		while (run) {
			
			System.out.println("계산기를 사용메뉴를 선택해주세요.? 1.사용 2.종료 3.조회");
			int run_flag = sc.nextInt();
			if (run_flag == 1) {
				run = true;
				i++;
			} else if(run_flag ==2){
				run = false;
				System.out.println("사용을 종료합니다.");
			} else {
				System.out.println("배열값을 출력합니다.");
				System.out.println("------------------");
				for (int j = 0; j < 1000; j++) {
					if (result_a[j] != 0) {
						System.out.printf("result_a[%d] = %d\n", j, result_a[j]);
						System.out.println("");
					}
				}
				
			}
			
			System.out.println("첫번째 숫자를 입력하시오.");
			int num1 = sc.nextInt();
			System.out.println("어떤 연산을 하시겠습니까? (+,-,*,/) 로 입력해주세요.");
			String a = sc.next();
			System.out.println("두번째 숫자를 입력하시오.");
			int num2 = sc.nextInt();

			switch (a) {
			case "+":
				result = num1 + num2;
				System.out.println("계산 결과 : " + result);
				System.out.println("------------------------");
				break;
			case "-":
				result = num1 - num2;
				System.out.println("계산 결과 : " + result);
				System.out.println("------------------------");
				break;
			case "*":
				result = num1 * num2;
				System.out.println("계산 결과 : " + result);
				System.out.println("------------------------");
				break;
			case "/":
				result = num1 / num2;
				System.out.println("계산 결과 : " + result);
				System.out.println("------------------------");
				break;
			}

			result_a[i] = result;


		}//while문 종료
		
		
		

	}

}
