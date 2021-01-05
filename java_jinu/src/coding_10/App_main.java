package coding_10;

import java.util.Scanner;

import Java_1217.Ex4_atm;

public class App_main {
	static int my_money = 100000;

	public static void main(String[] args) {
		App app = new App();
		app.setMy_money(my_money);
		while (true) {
			System.out.println("1.사용 2.사용종료");
			Scanner sc = new Scanner(System.in);
			int run = sc.nextInt();
			if(run==1) {
				System.out.println("카드를 넣습니다.");
				app.card();
				int menu = sc.nextInt();
				app.run(menu);
				
			} else {
				System.out.println("사용을 종료합니다.");
				my_money = app.getMy_money();
				break;
			}
			

		}
		
System.out.println(my_money);
	}

}
