package Java_1217;

import java.util.Scanner;

public class Ex2_burgerking {
	static int burger1;
	static int burger2;

	public Ex2_burgerking() {
		this.burger1 = 5000;
		this.burger2 = 4000;
	}

	public static void in(){
		System.out.println("버거킹에 오신걸 환영합니다.");
		
	}
	
	public static int order(int money) {
		System.out.println("주문할 메뉴를 선택해주세요.");
		System.out.println("1.burger1 2.burger2");
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		money = buy(menu,money);
		
		return money;
				
	}
	
	public static int buy(int menu, int money) {
		switch (menu) {
		case 1:
			money -= burger1;
			break;
		case 2:
			money -= burger2;
			break;
		}

		return money;
	}
	
	public static void out(){
		System.out.println("버거킹을 이용해주셔서 감사합니다.");
		
	}

}
