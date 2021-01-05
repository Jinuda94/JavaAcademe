package Java_1203;

import java.util.Scanner;

public class Game_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("총 재산을 입력하십시오.");
		int money1 = sc.nextInt(); // 총 재산
		while (true) {

			System.out.println("걸 돈을 입력하십시오. (게임을 종료하고 싶으시면 0을 입력하십시오.)");
			int money2 = sc.nextInt(); // 걸 돈

			if (money2 == 0) {
				System.out.println("게임을 종료하겠습니다.");
				System.out.println("게임결과 당신의 재산은 " + money1 + "이 되셨습니다.");
				break;
			} else if (money2 > money1) {
				System.out.println("총 재산:" + money1);
				System.out.println("건 돈:" + money2);
				System.out.println("당신이 가진 재산보다 많이 걸었습니다. 비정상적 배팅으로 게임을 종료합니다.");
				break;
			} // while문 종료

			money1 = money1 - money2; // 총 재산 - 건 돈

			int dice1 = (int) (Math.random() * 6) + 1; // 주사위1 굴리기
			int dice2 = (int) (Math.random() * 6) + 1; // 주사위2 굴리기

			System.out.println("첫번쨰 주사위 눈금은 " + dice1 + "입니다.");
			System.out.println("두번쨰 주사위 눈금은 " + dice2 + "입니다.");

			/*
			 * Rule 
			 * 1.주사위가 1 1 이 나오면 건 돈의 2배 받음 
			 * 2.주사위가 2 6 이 나오면 건 돈의 4배 받음 
			 * 3.주사위가 6 6 이 나오면
			 * 건 돈의 2배 손해 그 외 본전
			 */

			if (dice1 == 1 && dice2 == 1) {
				money1 = money1 + (money2 * 2);
			} else if ((dice1 == 2 && dice2 == 6) || (dice1 == 6 && dice2 == 2)) {
				money1 = money1 + (money2 * 4);
			} else if (dice1 == 6 && dice2 == 6) {
				money1 = money1 - (money2 * 2);
			} else {
				money1 = money1 + money2;
			} // 게임 룰 적용

			System.out.println("현재 남은 재산은 " + money1 + "입니다.");

			if (money1 <= 0) {
				System.out.println("파산하셨습니다.");
				break;
			} // while 종료문(파산엔딩)

		} // while문 마지막
	}

}
