package Java_1215;

import java.util.Random;
import java.util.Scanner;

public class Method_ex2 {

	public static void main(String[] args) {
		/*
		 * 1.Scan 숫자받기 
		 * 2.dice 메소드 만들어서 위에받은 숫자만큼 굴림 
		 * 3.dice에서 숫자를 받으면 그 숫자를 가지고 다시 dic_2를 호출해서 굴림
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("굴릴 숫자");
		int num = sc.nextInt();
		sc.close();
		int dice1 = dice(num);
		System.out.println("dice1 : " + dice1);
		int dice2 = dice(dice1);
		System.out.println("dice2 : " + dice2);

	}

	public static int dice(int num) {
		Random rdm = new Random();
		int dice = rdm.nextInt(6) + 1;
		return dice;
	}
}
