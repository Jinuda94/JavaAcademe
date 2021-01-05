package Java_1207;

import java.util.Scanner;

public class Pyramid_ex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("단수를 입력하세요:");

		int dan = sc.nextInt();

		/* 피라미드 만들기 */

//		for(int i = 0; i<dan; i++) {

//			for(int j = 0; j<dan-i; j++) {

//				System.out.print(" ");

//			}

//			for(int k = 0; k<2*i+1; k++) {

//				System.out.print("*");

//			}

//			System.out.println();

//		}

		/* 역 피라미드 만들기 */

		for (int i = dan - 1; i >= 0; i--) {

			for (int j = 0; j < dan - i; j++) {

				System.out.print(" ");

			}

			for (int k = 0; k < 2 * i + 1; k++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}
}
