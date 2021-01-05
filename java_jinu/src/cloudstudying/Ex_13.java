package cloudstudying;

import java.util.Scanner;

public class Ex_13 {
	public static String getRole(int age) {
		String str = "";
		if(age<6) {
			str = "유아";
		} else if(age<13) {
			str = "어린이";
		} else if(age<18) {
			str = "청소년";
		} else {
			str = "성인";
		}
		return str;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이입력");
		int age = sc.nextInt();
		sc.close();
		String role = getRole(age);
		System.out.println(role);
		

	}

}
