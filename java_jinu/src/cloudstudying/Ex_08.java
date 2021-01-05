package cloudstudying;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세자리 숫자입력(100~999)");
		int num = sc.nextInt();
		sc.close();
		int num_s[] = new int[3];
		num_s[0] = num/100;
		num_s[1] = (num/10)%10;
		num_s[2] = num%10;
		for(int i=0; i<num_s.length; i++) {
			System.out.println(num_s[i]);
		}
		int sum = num_s[0]+num_s[1]+num_s[2];
		System.out.println("합: "+sum);
		

	}

}
