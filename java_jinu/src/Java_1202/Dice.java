package Java_1202;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("주사위 면체를 숫자로 입력하시오.");
		int num = sc.nextInt();
		double dice = Math.random();
//		System.out.println(dice);
		System.out.println(num + "면체 주사위를 굴립니다.");

		int dice_num = (int) (dice * num) + 1;

		if (dice_num > num) {
			System.out.println("주사위 값은: " + (dice_num - 1));
		} else {
			System.out.println("주사위 값은: " + dice_num);
		}

	}

}
