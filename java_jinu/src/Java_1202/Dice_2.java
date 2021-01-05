package Java_1202;

import java.util.Scanner;

public class Dice_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dice_num1 = (int) (Math.random() * 6) + 1;
		int dice_num2 = (int) (Math.random() * 6) + 1; 

		if (dice_num1 > 6 || dice_num2 > 6) {
			System.out.println("첫번째 주사위 값은: " + (dice_num1 - 1));
			System.out.println("두번째 주사위 값은: " + (dice_num2 - 1));
		} else {
			System.out.println("첫번째 주사위 값은: " + dice_num1);
			System.out.println("두번째 주사위 값은: " + dice_num2);
		}
		
	}
}
