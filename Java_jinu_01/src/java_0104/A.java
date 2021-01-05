package java_0104;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		B_List list = new B_List();
		
		Scanner sc = new Scanner(System.in);
		int menu;
		boolean keepLoop = true;
		int current = 0;

		while (keepLoop) {
			System.out.println("1.입력 2.출력 3.종료");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				list.input();
				break;
			case 2:
				list.print();
				break;
			case 3:
				keepLoop = false;
				break;
			}
		}

	}

}
