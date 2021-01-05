package Java_1207;

import java.util.Scanner;

public class Car_ex {

	public static void main(String[] args) {
		boolean run = true; // 시동
		boolean s = true; // 자동차 속도조절
		int now_speed = 0; // 자동차 현재속도
		int car_s = 0; // 자동차에 따른 가속/감속 속도
		int max_speed = 0; // 자동차에 따른 최대속도 설정

		/* 자동차 운전 반복문 */
		while (run) {
			Scanner sr = new Scanner(System.in);
			System.out.println("자동차 종류를 선택해주세요.");
			System.out.println("1.Porsche 2.Benz 3.SONATA");
			int car_flag = sr.nextInt(); // 자동차 종류 선택 flag
			/* 자동차에 따른 가속/감속 속도조절 */
			switch (car_flag) {
			case 1:
				car_s = 10;
				max_speed = 300;
				break;
			case 2:
				car_s = 8;
				max_speed = 240;
				break;
			case 3:
				car_s = 5;
				max_speed = 200;
				break;
			}
			System.out.println("자동차 운전을 시작합니다.");
			System.out.println("1. 시동on 2. 시동off");
			int run_flag = sr.nextInt();
			if (run_flag == 1) {
				System.out.println("시동이 켜졌습니다. 운전을 시작하겠습니다.");
				s = true;
			}
			if (run_flag == 2) {
				run = !run;
				System.out.println("시동이 꺼졌습니다.");
			}
			/* 속도조절 반복문 */
			while (s) {
				System.out.println("현재속도 : " + now_speed + "km 입니다.");
				System.out.println("속도를 조절해주십시오. 1.가속(+5km) 2.감속(-5km) 3.급브레이크");
				int speed = sr.nextInt();
				/* 가속/감속/급브레이크(정지) */
				switch (speed) {
				case 1:
					if (now_speed < max_speed) {
						now_speed = now_speed + car_s;
					} else {
						System.out.println("최고속도 입니다. 더이상 가속할 수 없습니다.");
					}
					break;
				case 2:
					if (now_speed >= car_s) {
						now_speed = now_speed - car_s;
					}
					break;
				case 3:
					now_speed = 0;
					System.out.println("급 정지를 하셨습니다.");
				}
				if (now_speed == 0) {
					s = !s; // 속도조절문 벗어남
					System.out.println("현재속도 : 0km로 차량이 멈췄습니다.");
					System.out.println("---------------------------------");

				}

			} /* 속도조절 반복문 종료 */

		}

	}

}
