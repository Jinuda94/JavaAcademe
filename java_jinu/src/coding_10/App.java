package coding_10;

import java.util.ArrayList;
import java.util.Scanner;

public class App extends Passward {
	int my_money;
	ArrayList<String> record = new ArrayList<String>();
	boolean pass;

	public App() {
		
	}

	public int getMy_money() {
		return my_money;
	}

	public void setMy_money(int my_money) {
		this.my_money = my_money;
	}

	public void card() {
		System.out.println("카드를 읽고있습니다.");
		System.out.println("잠시만 기다려주세요.");
		System.out.println("비밀번호를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		String passward = sc.next();
		while (passward_check(passward)) {
			System.out.println("비밀번호가 틀렸습니다.");
			System.out.println("비밀번호를 입력해주세요.");
			passward = sc.next();
		}
		pass = passward_check(passward);
		System.out.println("사용하실 업무를 골라주세요.");
		System.out.println("1.조회 2.입금 3.출금");
	}

	public boolean run(int menu) {

		switch (menu) {
		case 1:
			lookup();
			break;
		case 2:
			deposit();
			break;
		case 3:
			withdraw();
			break;
		}
		return true;

	}

	public void lookup() {
		System.out.println("현재 잔액: " + my_money);

		for (String k : record) {
			System.out.println(k);
		}

	}

	public void deposit() {
		System.out.println("입금하실 금액을 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int deposit = sc.nextInt();
		my_money += deposit;
		int money_record = my_money;
		String r1 = "입금: ";
		String r2 = "   잔액: ";
		record.add(r1 + deposit + r2 + money_record);

	}

	public void withdraw() {
		System.out.println("현재 잔액: " + my_money);
		System.out.println("출금하실 금액을 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int withdraw;
		do {
				withdraw = sc.nextInt();
				if(my_money<withdraw) {
					System.out.println("출금 금액이 잔액을 넘습니다.");
					System.out.println("출금하실 금액을 입력해주세요.");
				}
			}while(my_money<withdraw);
		my_money -= withdraw;
		int money_record = my_money;
		String r1 = "출금: ";
		String r2 = "   잔액: ";
		record.add(r1 + withdraw + r2 + money_record);

	}
}
