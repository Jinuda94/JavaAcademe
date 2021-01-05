package Java_1211;

import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sound = 0;
		int ch = 1;
		boolean sound_run = true;
		boolean ch_run = true;
		boolean menu_run = true;
		boolean on_off = false;
		System.out.println("전원on 1입력");
		int on = sc.nextInt();
		if (on == 1) {
			on_off = true;
		}
		while (on_off) {
			/* 메뉴바 */
			while (menu_run) {
				System.out.println("------------------");
				System.out.println("현재채널 :" + ch);
				System.out.println("현재음량 :" + sound);
				System.out.println("------------------");
				System.out.println("1.음량조절 2.채널조절 3.TV전원 off");
				int menu = sc.nextInt();
				switch (menu) {
				case 1:
					/* 음량조절 */
					while (sound_run) {
						System.out.println("-------------------------------------");
						System.out.println("음량조절");
						System.out.println("1.올림 2.내림 3.음량조절 종료");
						int sound_remote = sc.nextInt();
						switch (sound_remote) {
						case 1:
							if (sound < 40) {
								sound += 1;
							} else {
								System.out.println("최대음량 입니다.");
							}

							break;
						case 2:
							if (sound > 0) {
								sound -= 1;
							} else {
								System.out.println("최소음량 입니다.");
							}
							break;
						case 3:
							sound_run = false;
							System.out.println("메뉴바로 돌아갑니다.");
							break;
						}

						if (sound_remote != 3) {
							System.out.println("-------------------------------------");
							System.out.println("현재 음량: " + sound);
						}

					} // 음량 while문 종료
					break;
				case 2:
					/* 채널변경 */
					while (ch_run) {
						// 1.채널 올리고 내리고 기능 만들기 채널갯수는 100번까지
						// 2.채널을 입력해서 변경하게 만들기
						System.out.println("-------------------------------------");
						System.out.println("채널변경");
						System.out.println("1.올림 2.내림 3.채널번호 입력 4.채널변경 종료");
						int ch_remote = sc.nextInt();
						switch (ch_remote) {
						case 1:
							if (ch < 100) {
								ch += 1;
							} else {
								ch = 1;
							}
							break;
						case 2:
							if (ch > 1) {
								ch -= 1;
							} else {
								ch = 100;
							}
							break;
						case 3:
							System.out.println("원하시는 채널번호를 입력하세요.");
							int ch_input = sc.nextInt();
							if (ch_input > 0 && ch_input <= 100) {
								ch = ch_input;
							} else {
								System.out.println("없는 채널 입니다.");
							}
							break;
						case 4:
							ch_run = false;
							System.out.println("메뉴바로 돌아갑니다.");
							break;
						}
						if (ch_remote != 4) {
							System.out.println("-------------------------------------");
							System.out.println("현재 채널: " + ch);
						}
					} // 채널변경 while문 종료
					break;
				case 3:
					menu_run = false;
					System.out.println("TV전원을 껐습니다.");
					break;
				}
			}

		}

	}
}
