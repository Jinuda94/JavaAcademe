package Java_1202;

import java.util.Scanner;

public class Book_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("연도를 입력하세요 : ");
		int year = sc.nextInt();
		System.out.println(year);

//		if (year % 4 == 0 && year % 100 != 0) {
//			System.out.println(year + "년은 윤년입니다.");
//		} else if(year%400==0){
//			System.out.println(year + "년은 윤년입니다.");
//		} else {
//			System.out.println(year + "년은 윤년이 아닙니다.");
//		}

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 윤년이 아닙니다.");
		}
	}

}
