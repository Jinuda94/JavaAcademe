package Java_1202;

import java.util.Scanner;

public class Dice_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 주사위 면체를 숫자로 입력하시오.");
		int num1 = sc.nextInt();
		System.out.println("두번째 주사위 면체를 숫자로 입력하시오.");
		int num2 = sc.nextInt();
		
		int dice_num1 = (int) (Math.random() * num1) + 1;
		int dice_num2 = (int) (Math.random() * num2) + 1; 
		
		int dice_sum=0;
		
		System.out.println(num1+"면체 주사위를 굴립니다.");
		System.out.println(num2+"면체 주사위를 굴립니다.");

		if (dice_num1 > num1 || dice_num2 > num2) {
			System.out.println("첫번째 주사위 값은: " + (dice_num1 - 1));
			System.out.println("두번째 주사위 값은: " + (dice_num2 - 1));
			dice_sum=(dice_num1-1)+(dice_num2-1);
		} else {
			System.out.println("첫번째 주사위 값은: " + dice_num1);
			System.out.println("두번째 주사위 값은: " + dice_num2);
			dice_sum=dice_num1+dice_num2;
		}
		System.out.println("주사위 값의 합은: "+dice_sum);

	}

}
