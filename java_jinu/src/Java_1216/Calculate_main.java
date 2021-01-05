package Java_1216;

import java.util.Scanner;

public class Calculate_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자");
		int i = sc.nextInt();
		System.out.println("두번째 숫자");
		int j = sc.nextInt();
		System.out.println("연산자");
		String s =sc.next();
		Calculate ca = new Calculate(i,j,s);
		int result = ca.cal();
		System.out.print("결과:");
		System.out.println(result);
		
	
	}

}
