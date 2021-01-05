package Java_1202;

import java.util.Scanner;

public class Book_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("교환할 돈의 액수를 입력하시오.");
		int money = sc.nextInt();
		System.out.println("교환할 돈은 ? " + money + "원");

		int change_500 = money / 500;
		System.out.println("오백원짜리 ==> " + change_500 + "개");
		int change = money % 500;

		int change_100 = change / 100;
		System.out.println("백원짜리 ==> " + change_100 + "개");
		change = change % 100;

		int change_50 = change / 50;
		System.out.println("오십원짜리 ==> " + change_50 + "개");
		change = change % 50;

		int change_10 = change / 10;
		System.out.println("백원짜리 ==> " + change_10 + "개");
		change = change % 10;

		System.out.println("바꾸지 못한 잔돈 ==> " + change + "원");

	}

}
