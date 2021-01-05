package java_1230;

import java.util.Scanner;

public class Coding_4_remote {
	Scanner sc = new Scanner(System.in);
	int ch;
	int sound;
	boolean on;

	public Coding_4_remote() {
		ch = 1;
		sound = 0;
	}

	public void run() {
		on = on();
		while (on) {
			System.out.println("메뉴 선택 1.채널 2.볼륨 3.전원");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				ch_remote();
				break;
			case 2:
				System.out.println("볼륨 조절 1.+ 2.-");
				int bol = sc.nextInt();
				if (bol == 1) {
					sound_remote(true);
				} else {
					sound_remote(false);
				}
				break;
			case 3:

				on = on();
				break;
			}
		}
	}

	public int ch_remote() {
		System.out.println("채널을 입력하세요.");
		int ch_change = sc.nextInt();
		ch = ch_change;
		System.out.println(ch + "채널로 이동하였습니다.");
		return ch;
	}

	public int sound_remote(boolean u_d) {
		if (u_d) {
			sound++;
			System.out.println("볼륨이 올라갔습니다.");
		} else {
			sound--;
			System.out.println("볼륨이 내려갔습니다.");
		}
		System.out.println("현재 볼륨은" + sound + "입니다.");

		return sound;

	}

	public boolean on() {
		System.out.println("tv전원 1.on 2.off");
		int on = sc.nextInt();
		if (on == 1) {
			System.out.println("Tv가 켜졌습니다");
			return true;
		} else {
			System.out.println("Tv가 꺼졌습니다");
			return false;
		}
	}

}
