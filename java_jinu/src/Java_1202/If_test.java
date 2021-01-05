package Java_1202;

import java.util.Scanner;

public class If_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요.");
		int score = sc.nextInt();

		if (score >= 100) {
			System.out.println("너무 많아요");
		}

		else if (score > 50 && score < 100) {
			System.out.println("적당해요.");
		}

		else if (score < 50) {
			System.out.println("너무 작아요.");
		}
	}

}