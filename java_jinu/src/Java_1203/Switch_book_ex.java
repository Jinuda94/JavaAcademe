package Java_1203;

import java.util.Scanner;

public class Switch_book_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;

		System.out.println("출생연도를 입력하세요 : ");
		year = sc.nextInt() % 12;

//		switch(year) {
//		case 0: System.out.println("원숭이띠"); break;
//		case 1: System.out.println("닭띠"); break;
//		case 2: System.out.println("개띠"); break;
//		case 3: System.out.println("돼지띠"); break;
//		case 4: System.out.println("쥐띠"); break;
//		case 5: System.out.println("소띠"); break;
//		case 6: System.out.println("호랑이띠"); break;
//		case 7: System.out.println("토끼띠"); break;
//		case 8: System.out.println("용띠"); break;
//		case 9: System.out.println("뱀띠"); break;
//		case 10: System.out.println("말띠"); break;
//		case 11: System.out.println("양띠"); break;
//		
//		}

//		switch(year) {
//		case 0: System.out.println("원숭이띠"); 
//		case 1: System.out.println("닭띠"); 
//		case 2: System.out.println("개띠"); 
//		case 3: System.out.println("돼지띠"); 
//		case 4: System.out.println("쥐띠"); 
//		case 5: System.out.println("소띠"); 
//		case 6: System.out.println("호랑이띠"); 
//		case 7: System.out.println("토끼띠"); 
//		case 8: System.out.println("용띠"); 
//		case 9: System.out.println("뱀띠"); 
//		case 10: System.out.println("말띠"); 
//		case 11: System.out.println("양띠"); 
//		
//		}

		if (year == 0) {
			System.out.println("원숭이띠");
		} else if (year == 1) {
			System.out.println("닭띠");
		} else if (year == 2) {
			System.out.println("개띠");
		} else if (year == 3) {
			System.out.println("돼지띠");
		} else if (year == 4) {
			System.out.println("쥐띠");
		} else if (year == 5) {
			System.out.println("소띠");
		} else if (year == 6) {
			System.out.println("호랑이띠");
		} else if (year == 7) {
			System.out.println("토끼띠");
		} else if (year == 8) {
			System.out.println("용띠");
		} else if (year == 9) {
			System.out.println("뱀띠");
		} else if (year == 10) {
			System.out.println("말띠");
		} else if (year == 11) {
			System.out.println("양띠");
		}

	}

}
