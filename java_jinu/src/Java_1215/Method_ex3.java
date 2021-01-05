package Java_1215;

import java.util.Scanner;

public class Method_ex3 {

	public static void main(String[] args) {
		/*
		 * 1.장르 선택 2.장르당 영화 5개씩 3.배열에 선택한 장르 영화정보 저장 출력
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("영화 장르를 선택해주세요");
		System.out.println("1.SF 2.공포 3.액션");
		int genre = sc.nextInt();
		sc.close();
		String movie_title[] = new String[5];
		switch (genre) {
		case 1:
			System.out.println("SF");
			movie_title = sf();
			break;
		case 2:
			System.out.println("Horror");
			movie_title = horror();
			break;
		case 3:
			System.out.println("Action");
			movie_title = action();
			break;

		}
		System.out.println("-----------------------------");
		for(String k : movie_title) {
			System.out.println(k);
		}
		

	}
	
	public static String[] sf() {
		String movie[] = { "인터스텔라", "인베이젼 2020", "코드 8", "에드 아스트라", "스펙트럴" };
		return movie;
	}

	public static String[] horror() {
		String movie[] = { "비바리움", "헌트", "어스", "할로윈", "텍사스 전기톱 연쇄살인사건" };
		return movie;
	}

	public static String[] action() {
		String movie[] = { "존 윅", "스파이", "로그", "악인전", "범죄도시" };
		return movie;
	}

}
