package Java_1217;

import java.util.Scanner;

public class Ex3_man {
	static int r_page = 1;
	public static void main(String[] args) {
		Ex3_book bk = new Ex3_book(r_page);
		
		int b_page = bk.get_page();
		System.out.println("책의 총페이지 수 :"+b_page);
		boolean run = true;
		System.out.println("현재 페이지는");
		while(run) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("책을 읽습니다.");
			bk.read();
			
			System.out.println("1.책장을 넘긴다. 2.책을 그만읽는다.");
			int next = sc.nextInt();
			switch(next) {
			case 1: r_page = bk.n_page(); break;
			case 2: System.out.println("책을 그만읽습니다.");
			}
			
			System.out.println( "현재 페이지는: "+r_page+"입니다.");
			if(b_page==r_page) {
				System.out.println("마지막 페이지입니다.");
				System.out.println("책을 읽습니다.");
				bk.read();
				System.out.println("책을 모두 읽으셨습니다. 책읽기를 중단합니다.");
				run = false;
			}
		}

	}

}
