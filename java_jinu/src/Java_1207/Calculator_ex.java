package Java_1207;

import java.util.Scanner;

public class Calculator_ex {

	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			Scanner sc = new Scanner(System.in);
			System.out.println("첫번째 숫자를 입력하시오.");
			int num1 = sc.nextInt();
			System.out.println("어떤 연산을 하시겠습니까? (+,-,*,/) 로 입력해주세요.");
			String a = sc.next();
			System.out.println("두번째 숫자를 입력하시오.");
			int num2 = sc.nextInt();
			
			int result = 0;
			switch (a) {
			case "+": 
				result = num1 + num2; 
				System.out.println("계산 결과 : "+result);
				break;
			case "-": 
				result = num1 - num2; 
				System.out.println("계산 결과 : "+result);
				break;
			case "*": 
				result = num1 * num2; 
				System.out.println("계산 결과 : "+result);
				break;
			case "/": 
				double result_d = (double) result;
				result_d = (double)num1 / (double)num2;
				System.out.println("계산 결과 : "+result_d);
				break;
			}
			System.out.println("계속 계산기를 사용하시겠습니까? 1.사용 2.종료");
			int run_flag = sc.nextInt();
			if(run_flag == 1) {
				run = true;
			} else {
				run = false;
				System.out.println("사용을 종료합니다.");
			}
			
			
			
			
		}

	}

}
