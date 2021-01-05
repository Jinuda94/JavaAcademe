package cloudstudying;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		double euro = 1320.48026;
		double dollar = 1063.82979;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("유로 입력");
		int e_in = sc.nextInt();
		System.out.println("달러 입력");
		int d_in = sc.nextInt();
		sc.close();
		
		System.out.println(e_in+"유로 + "+d_in+"달러 = "+(e_in*euro+d_in*dollar)+" 원");
	}

}
