package Java_1204;

import java.util.Scanner;

public class Book_ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" 몇 단 ? ");
		int dan = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " X " + i + " = " + dan * i);
		}

	}

}
