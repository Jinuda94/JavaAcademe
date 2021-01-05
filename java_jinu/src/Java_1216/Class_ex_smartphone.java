package Java_1216;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Class_ex_smartphone {

	public String time() {
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy년 MM월dd일 HH시mm분ss초");

		Date time = new Date();

		String time1 = format1.format(time);

		return time1;

	}

	public static ArrayList<String> ph_book(ArrayList<String>ph_book) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> phone_book = new ArrayList<String>();
		phone_book.addAll(ph_book);
		boolean run = true;
		while (run) {
			System.out.println("1.연락처 추가 2.연락처 조회 3.종료");
			int f = sc.nextInt();
			switch (f) {
			case 1:
				phone_book.addAll(ph_add());
				break;
			case 2:
				ph_view(phone_book);
				break;
			case 3:
				run = false;
				break;

			}
		}
		return phone_book;
	}

	public static ArrayList<String> ph_add() {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int a = 0;
		ArrayList<String> phone_book = new ArrayList<String>();
		while (run) {
			System.out.println("1.연락처 추가 2.종료");
			int p_flag = sc.nextInt();
			switch (p_flag) {
			case 1:
				System.out.println("추가할 연락처 입력");
				String input = sc.next();
				phone_book.add(a, input);
				a++;
				break;
			case 2:
				run = false;
				break;
			}// switch문 종료

		} // while문 종료

		return phone_book;
	}

	public static void ph_view(ArrayList<String> ph) {

		for (int i = 0; i < ph.size(); i++) {

			System.out.println(ph.get(i));

		}

	}

}
