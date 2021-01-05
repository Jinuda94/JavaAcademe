package java_1230;

import java.util.Random;
import java.util.Scanner;

public class Coding_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		boolean run = true;
		while (run) {
			System.out.println("1.입력 2.종료");
			int run_flag = sc.nextInt();
			if (run_flag == 1) {
				System.out.println("정수입력:");
				result += sc.nextInt();
			} else {
				run = false;
			}
		}

		System.out.println("더한 값:"+result);
		
		Random rdm = new Random();
		int r_num = rdm.nextInt(10);
		System.out.println("랜덤숫자:"+r_num);
		
		System.out.println("곱한 값:"+result*r_num);
		

	}

}
