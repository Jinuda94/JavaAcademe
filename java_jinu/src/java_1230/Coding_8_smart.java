package java_1230;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Coding_8_smart {
	Scanner sc = new Scanner(System.in);
	String p_num[] = { "010-1111-1234", "010-1234-3424", "010-2312-2142" };
	int i = 0;

	public void run() {
		while (scan()) {
			System.out.println("사용할 메뉴 선택");
			System.out.println("1.전화번호부 2.전화 3.시간 4.인터넷검색");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				numberbook();
				break;
			case 2:
				call();
				break;
			case 3:
				time();
				break;
			case 4:
				internet();
				break;
			}
		}

	}

	public void numberbook() {
		for (String k : p_num) {
			System.out.println((i + 1) + "." + k);
			i++;
		}
		i = 0;
	}

	public void call() {
		System.out.println("1.전화번호 입력 2.전화번호부 사용");
		int call_flag = sc.nextInt();
		if (call_flag == 1) {
			System.out.println("전화번호 입력하세요.");
			String number = sc.next();
			System.out.println(number + "에 전화를 겁니다.");
		} else {
			numberbook();
			System.out.println("전화번호부에서 번호를 골라주세요.");
			int book_flag = sc.nextInt();
			System.out.println(p_num[book_flag - 1] + "에 전화를 겁니다.");
		}

	}

	public void time() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월dd일 HH시mm분ss초");

		Date time = new Date();

		String time1 = format.format(time);

		System.out.println(time1);
	}

	public void internet() {
		System.out.println("인터넷 검색을 시작합니다.");
		System.out.println("검색할 내용을 입력하세요.");
		String search = sc.next();
		System.out.println(search + "와 관련된 검색결과입니다.");
		for (int i = 0; i < 10; i++) {
			System.out.println(search + i);
		}
	}

	public boolean scan() {
		System.out.println("1.사용 2.종료");
		int a = sc.nextInt();
		boolean b;
		if (a == 1) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}
}
