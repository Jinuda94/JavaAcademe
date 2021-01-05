package java_0104;

import java.util.Scanner;

public class Exam_array {
	public static void main(String[] args) {
		// Exam[] exams = new Exam[3];
		Exam_list list = new Exam_list();
		list.exams = new Exam[3];
		// exams[0]~exams[2]
		list.current = 0;
		Scanner scan = new Scanner(System.in);
		int menu;
		boolean keepLoop = true;

		while (keepLoop) {
			System.out.println("----------------------------------------------------------");
			System.out.println("|         메인 메뉴                   | ");
			System.out.println("----------------------------------------------------------");
			System.out.println("\t1. 성적입력 ");
			System.out.println("\t2. 성적출력 ");
			System.out.println("\t3. 종료 ");
			System.out.println("\t선택> ");
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				input_list(list);
				break;
			case 2:
				print_list(list);
//				print_list(list,1);
				break;
			case 3:
				keepLoop = false;
				break;

			default:
				System.out.println("잘못된 값을 입력하셨습니다 1~3 까지의 숫자를 입력해주세요.");
			}
		}
	}

	private static void print_list(Exam_list list) {// 출력
		print_list(list, list.current);
	}

	private static void print_list(Exam_list list, int count) {// 출력
		System.out.println("----------------------------------------------------------");
		System.out.println("|           성적 출력                  | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();
		for (int i = 0; i < count; i++) {
			
			Exam exam = list.exams[i];
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;

			int total = kor + eng + math;
			double avg = total / 3.0;

			System.out.printf("국어 : %d\n", kor);
			System.out.printf("영어 : %d\n", eng);
			System.out.printf("수학 : %d\n", math);

			System.out.printf("총점 : %d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("----------------------------------------------------------");
		}
	}
	
	private static void input_list(Exam_list list) { // 입력

		int kor;
		int eng;
		int math;
		Scanner scan = new Scanner(System.in);
		System.out.println("----------------------------------------------------------");
		System.out.println("|         성적 입력                    | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		do {
			System.out.printf("국어 : ");
			kor = scan.nextInt();
			if (kor < 0 || 100 < kor)
				System.out.println("국어 성적은 0~100까지의 범위만 입력해주세요.");
		} while (kor < 0 || 100 < kor);

		System.out.println("----------------------------------------------------------");

		do {
			System.out.printf("영어 : ");
			eng = scan.nextInt();
			if (eng < 0 || 100 < eng)
				System.out.println("영어 성적은 0~100까지의 범위만 입력해주세요.");
		} while (eng < 0 || 100 < eng);
		System.out.println("----------------------------------------------------------");

		do {
			System.out.printf("수학 : ");
			math = scan.nextInt();
			if (math < 0 || 100 < math)
				System.out.println("수학 성적은 0~100까지의 범위만 입력해주세요.");
		} while (math < 0 || 100 < math);
		System.out.println("----------------------------------------------------------");

		Exam exam = new Exam();

		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;

		if (list.exams.length == list.current) {
			Exam[] temp = new Exam[list.exams.length + 5];
			for (int i = 0; i < list.exams.length; i++) {
				temp[i] = list.exams[i];

			}
			list.exams = temp;
		}
		
		list.exams[list.current] = exam;
		list.current++;
		
		
	}

}
