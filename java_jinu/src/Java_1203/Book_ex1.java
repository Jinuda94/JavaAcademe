package Java_1203;

import java.util.Scanner;

public class Book_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;

		System.out.println("첫번째 수를 입력하세요: (1~9사이의 수를 입력해주세요.)");
		int num1 = sc.nextInt();
		if((num1<1)||(num1>9)) {
			System.out.println("숫자를 잘못입력하셨습니다.(1~9사이의 수를 입력해주세요.)");
			num1 = sc.nextInt();
		}
		System.out.println("계산할 연산자를 (+,-,*,/)중 입력하세요:");
		String oper = sc.next();
		
		if(!(oper.equals("+")||oper.equals("-")||oper.equals("*")||oper.equals("/"))) {
			System.out.println("연산자를 잘못입력하셨습니다. (+,-,*,/)중 입력하세요:");
			oper = sc.next();
		}
		System.out.println("두번째 수를 입력하세요:");
		int num2 = sc.nextInt();
		if((num2<1)||(num2>9)) {
			System.out.println("숫자를 잘못입력하셨습니다.(1~9사이의 수를 입력해주세요.)");
			num2 = sc.nextInt();
		}

		switch (oper) {
		case "+":
			result = num1 + num2;
			System.out.println(num1 + " " + oper + " " + num2 + " = " + result + " 입니다.");
			break;
		case "-":
			result = num1 - num2;
			System.out.println(num1 + " " + oper + " " + num2 + " = " + result + " 입니다.");
			break;
		case "*":
			result = num1 * num2;
			System.out.println(num1 + " " + oper + " " + num2 + " = " + result + " 입니다.");
			break;
		case "/":
			double result_1 = (double) num1 / (double) num2;
			System.out.println(num1 + " " + oper + " " + num2 + " = " + result_1 + " 입니다.");
			break;

		}

	}

}
