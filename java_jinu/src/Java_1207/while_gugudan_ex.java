package Java_1207;

import java.util.Scanner;

public class while_gugudan_ex {

	public static void main(String[] args) {
		int result = 0;
		boolean run = true;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("몇 단을 출력할지 적어주세요. ");
			int dan = sc.nextInt();
		
			for (int j = 1; j < 10; j++) {
				result = dan * j;
				System.out.println(dan + " X " + j + " = " + result);
			}
			System.out.println("계속 진행하시겠습니까? 1.진행 2.종료");
			int run_flag= sc.nextInt();
			if(run_flag==2) {
				run = !run;
				System.out.println("프로그램이 종료되었습니다.");
			}  			
			
		}

	}

}
