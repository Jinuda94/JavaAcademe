package java_1221;

import java.util.Random;

public class Dice_main {

	public static void main(String[] args) {

		Dice di = new Dice();

		int dice = di.getDice();
		
		switch (dice) {
		case 1:
			one();
			break;
		case 2:
			two();
			break;
		case 3:
			three();
			break;
		case 4:
			four();
			break;
		case 5:
			five();
			break;
		}

	}

	public static void one() {
		System.out.println("1입니다.");
	}

	public static void two() {
		System.out.println("2입니다.");
	}

	public static void three() {
		System.out.println("3입니다.");
	}

	public static void four() {
		System.out.println("4입니다.");
	}

	public static void five() {
		System.out.println("5입니다.");
	}

}
