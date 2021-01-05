package Java_1202;

import java.util.Scanner;

public class Game_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dice_num1 = (int) (Math.random() * 6) + 1;
		int dice_num2 = (int) (Math.random() * 6) + 1; 
		
		int dice_sum=0;
		int dice_game=0;
				
		System.out.println("첫번째 주사위 값은: " + dice_num1);
		System.out.println("두번째 주사위 값은: " + dice_num2);
		dice_sum=dice_num1+dice_num2;
		
		System.out.println("주사위 값의 합은: "+dice_sum);
			
		if(dice_sum==2) {
			System.out.println("부산입니다.");
		}
		if(dice_sum>=3&&dice_sum<=4) {
			System.out.println("울산입니다.");
		}
		if(dice_sum>=5&&dice_sum<=6) {
			System.out.println("대구입니다.");
		}
		if(dice_sum>=7&&dice_sum<=8) {
			System.out.println("대전입니다.");
		}
		if(dice_sum>=9&&dice_sum<=10) {
			System.out.println("판교입니다.");
			dice_num1 = (int) (Math.random() * 6) + 1;
			System.out.println("주사위를 새로 굴립니다.");
			System.out.println("새 주사위 값은: "+dice_num1);
			dice_game = dice_sum - dice_num1;
			System.out.println("뺀 값은: "+dice_game);
			System.out.println("뺀 값의 도시로 이동합니다.");
			if(dice_game==2) {
				System.out.println("부산입니다.");
			}
			if(dice_game>=3&&dice_game<=4) {
				System.out.println("울산입니다.");
			}
			if(dice_game>=5&&dice_game<=6) {
				System.out.println("대구입니다.");
			}
			if(dice_game>=7&&dice_game<=8) {
				System.out.println("대전입니다.");
			}
			if(dice_game==9) {
				System.out.println("판교입니다.");
			}
			
		}
		if(dice_sum>=11&&dice_sum<=12) {
			System.out.println("서울입니다.");
		}
		



	}

}
