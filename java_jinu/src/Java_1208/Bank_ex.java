package Java_1208;

import java.util.Scanner;

public class Bank_ex {

	public static void main(String[] args) {
		/* 1.입금 2.출금 3.조회 */

		int now_money = 0; // 현재잔액
		int deposit = 0; // 입금금액
		int withdraw = 0; // 출금금액
		int Y_N = 0; // yes or no
		boolean run = true;

		while (run) {
			System.out.println("원하시는 은행업무를 선택하여주세요.");
			System.out.println("1.입금 2.출금 3.조회 4.업무종료");
			Scanner sc = new Scanner(System.in);
			int task = sc.nextInt();
			switch (task) {
			case 1:
				System.out.println("입금하실 금액을 입력하여주세요.(숫자)");
				deposit = sc.nextInt();
				System.out.println("입금하실 금액이 " + deposit + "원이 맞습니까? 1.Yes 2.No");
				Y_N = sc.nextInt();
				if (Y_N == 1) {
					now_money += deposit;
					System.out.println(deposit + "원 입금되셨습니다.");
					System.out.println("현재 계좌 잔액: " + now_money + "원 입니다.");
					System.out.println("------------------------------------");
					deposit = 0;
				} else if (Y_N == 2) {
					System.out.println("처음부터 시작해주세요.");
					System.out.println("------------------------------------");
				}
				break;
			case 2:
				System.out.println("현재 계좌 잔액: " + now_money + "원");
				System.out.println("출금하실 금액을 입력하여주세요.(숫자)");
				withdraw = sc.nextInt();
				System.out.println("출금하실 금액이 " + withdraw + "원이 맞습니까? 1.Yes 2.No");
				Y_N = sc.nextInt();
				if (Y_N == 1) {
					if (now_money < withdraw) {
						System.out.println("출금하실 금액이 계좌 잔액을 넘었습니다.");
						System.out.println("------------------------------------");
					} else {
						now_money -= withdraw;
						System.out.println(withdraw + "원 출금되셨습니다.");
						System.out.println("현재 계좌 잔액: " + now_money + "원 입니다.");
						System.out.println("------------------------------------");
						withdraw = 0;
					}

				} else if (Y_N == 2) {
					System.out.println("처음부터 시작해주세요.");
					System.out.println("------------------------------------");
				}
				break;
			case 3:
				System.out.println("현재 계좌 잔액: " + now_money + "원 입니다.");
				System.out.println("------------------------------------");
				break;
			case 4:
				run = false;
				System.out.println("업무를 종료합니다.");
				break;
			default:
				System.out.println("잘못된 경로로 접속하였습니다. 다시 해주세요.");
				System.out.println("------------------------------------");
				break;

			}
		}

	}

}
