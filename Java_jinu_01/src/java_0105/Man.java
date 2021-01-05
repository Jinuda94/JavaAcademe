package java_0105;

import java.util.Scanner;

public class Man {

	public static void main(String[] args) {
		Phonebook pb = new Phonebook();
		
		Scanner sc = new Scanner(System.in);
		int menu;
		boolean keepLoop = true;

		while (keepLoop) {
			System.out.println("1.연락처 추가 2.연락처 삭제 3.연락처 보기 4.연락처 검색 5.종료");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				pb.input();
				break;
			case 2:
				pb.delete();
				break;
			case 3:
				pb.print();
				break;
			case 4:
				pb.find();
				break;
			case 5:
				keepLoop = false;
				break;
			}
		}
		

	}

}
