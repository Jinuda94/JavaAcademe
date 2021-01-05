package Java_1215;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		int money = 0;
		boolean menu_run = true;
		while (menu_run) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.주문 2.주문종료");
			int order = sc.nextInt();
			if(order==2) {
				menu_run = false;
			} else {
				System.out.println("분식 메뉴 | 1.라면(3000) 2.오뎅(500) 3.김밥(2500) 4.순대(3500)");
				int menu = sc.nextInt();
				money = menu_c(menu,money);
			}

			System.out.println("총 금액: "+money);

		}

	}
	
	public static int menu_c(int menu,int money) {
		
		switch (menu) {
		case 1:
			money += 3000;
			break;
		case 2:
			money += 500;
			break;
		case 3:
			money += 2500;
			break;
		case 4:
			money += 3500;
			break;
		
		}
		
		return money; 
	}

}
