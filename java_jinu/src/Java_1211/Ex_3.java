package Java_1211;

import java.util.Random;
import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		/* 123/456 1선택:1:50% 4:100%~~~ */

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("게임을 시작합니다.");
			System.out.println("-------------------------------------------------");
			System.out.println("|	1	|	2	|	3	|");
			System.out.println("-------------------------------------------------");
			System.out.println("|	4	|	5	|	6	|");
			System.out.println("-------------------------------------------------");
			Random rdm = new Random();
			int kicker = rdm.nextInt(6) + 1; // kicker의 공격위치 랜덤
//			System.out.println("키커의 공격방향은 " + kicker + "입니다.");
			double a = 0.5; // 골 성공률
			double goal = Math.random(); // 골 성공률 랜덤
//			System.out.println(goal);
			System.out.println("골키퍼 위치를 선정해주세요. 1.왼쪽 2.중간 3.오른쪽");
			int keeper = sc.nextInt();
			
			switch (keeper) {
			case 1:
				System.out.println("-------------------------------------------------");
				System.out.println("|	_O_	|	2	|	3	|");
				System.out.println("-------------------------------------------------");
				System.out.println("|	| |	|	5	|	6	|");
				System.out.println("-------------------------------------------------");
				break;
			case 2:
				System.out.println("-------------------------------------------------");
				System.out.println("|	1	|	_O_	|	3	|");
				System.out.println("-------------------------------------------------");
				System.out.println("|	4	|	| |	|	6	|");
				System.out.println("-------------------------------------------------");
				break;
			case 3:
				System.out.println("-------------------------------------------------");
				System.out.println("|	1	|	2	|	_O_	|");
				System.out.println("-------------------------------------------------");
				System.out.println("|	4	|	5	|	| |	|");
				System.out.println("-------------------------------------------------");
				break;
			}

			System.out.println("키커의 공격방향은 " + kicker + "입니다.");

			if (kicker > 3) {
				if (kicker == keeper + 3) {
					System.out.println("막았습니다.");
				} else {
					System.out.println("골입니다.");
				}
			} else {
				if (keeper == kicker) {
					if (goal > a) {
						System.out.println("막았습니다.");
					} else {
						System.out.println("골입니다.");
					}

				} else {
					System.out.println("골입니다.");
				}

			}

			System.out.println("다시게임을 하시겠습니까? 1.게임시작 2.게임종료");
			System.out.println("--------------------------------------");
			int run_flag = sc.nextInt();
			if (run_flag == 2) {
				run = false;
			}

		}

	}
}
