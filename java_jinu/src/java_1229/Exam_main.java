package java_1229;

import java.util.Scanner;

public class Exam_main {

	public static void main(String[] args) {
		Exam exam = new Exam();
		input(exam);
		print(exam);
	}

	public static void print(Exam exam) {
		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();
		int soci = exam.getSoci();
		int sci = exam.getSci();
		

		System.out.println("----------------------------------------------------------");
		System.out.println("|           성적 출력                  | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		int total = kor + eng + math + soci + sci;
		double avg = total / 5.0;

		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", math);
		System.out.printf("사회 : %d\n", soci);
		System.out.printf("과학 : %d\n", sci);

		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %6.2f\n", avg);
		System.out.println("----------------------------------------------------------");
	}

	public static void input(Exam exam) {
		String[] subj = new String[5];
		subj[0] = "국어";
		subj[1] = "영어";
		subj[2] = "수학";
		subj[3] = "사회";
		subj[4] = "과학";

		System.out.println("----------------------------------------------------------");
		System.out.println("|         성적 입력                    | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		for (int i = 0; i < subj.length; i++) {
			switch (i) {
			case 0:
				exam.setKor(do_process(subj[i]));
				break;
			case 1:
				exam.setEng(do_process(subj[i]));
				break;
			case 2:
				exam.setMath(do_process(subj[i]));
				break;
			case 3:
				exam.setSoci(do_process(subj[i]));
				break;
			case 4:
				exam.setSci(do_process(subj[i]));
				break;

			}

		}
	}

	public static int do_process(String str) {
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.printf(str + " : ");
			num = scan.nextInt();
			if (num < 0 || 100 < num)
				System.out.println(str + " 성적은 0~100까지의 범위만 입력해주세요.");
		} while (num < 0 || 100 < num);

		System.out.println("----------------------------------------------------------");
		return num;
	}
}

class Exam {
	private int kor;
	private int eng;
	private int math;
	private int soci;
	private int sci;

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {

		return math;
	}

	public void setMath(int math) {
		this.math = math / 2;
	}

	public int getSoci() {
		return soci;
	}

	public void setSoci(int soci) {
		this.soci = soci;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

}