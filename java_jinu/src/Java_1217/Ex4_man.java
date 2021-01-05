package Java_1217;

import java.util.Scanner;

public class Ex4_man {
	static int my_money = 100000;

	public static void main(String[] args) {
		Ex4_atm atm = new Ex4_atm(my_money);
		while (true) {
			System.out.println("1.사용 2.사용종료");
			Scanner sc = new Scanner(System.in);
			int run = sc.nextInt();
			if(run==1) {
				System.out.println("카드를 넣습니다.");
				atm.card();
				int menu = sc.nextInt();
				atm.run(menu);
			} else {
				System.out.println("사용을 종료합니다.");
				break;
			}
			

		}
		

	}

}
