package java_1229;

import java.util.Scanner;

public class ATM_gigi {
	int card;
	
	public ATM_gigi(int card){
		this.card = card;
	}
	
	public void deposit() {
		System.out.println("입금을 시작합니다.");
		card += do_process();
		System.out.println("입금 완료");
		System.out.println("출금 후 잔액: "+card+"원");
		
	}
	
	public void withdraw() {
		System.out.println("출금을 시작합니다.");
		card -= do_process();
		System.out.println("출금 완료");
		System.out.println("출금 후 잔액: "+card+"원");
		
	}
	
	public void lookup() {
		System.out.println("조회를 시작합니다.");
		System.out.println("잔액:"+card+"원");
	}
	
	public int do_process() {
		int money;
		Scanner sc = new Scanner(System.in);
		System.out.println("금액 입력:");
		money = sc.nextInt();
		return money;
	}

}

