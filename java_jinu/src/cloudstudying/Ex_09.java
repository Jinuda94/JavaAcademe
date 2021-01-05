package cloudstudying;

import java.util.Scanner;

public class Ex_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("초 입력");
		double gravity = -9.81; //중력 가속도
		double fallingTime = sc.nextDouble(); //떨어지는 시간
		sc.close();
		double initialPosition = 1000.0; //초기 높이
		
		double finalPosition = 0.5*gravity*Math.pow(fallingTime, 2)+initialPosition;
		System.out.printf("%.2f 초 후, 물체의 고도는 %.2f m\n", fallingTime, finalPosition);
	}

}
