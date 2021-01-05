package Java_1215;

import java.util.Random;

public class Lotto2 {
	
	public static void main(String[] args) {
		Random rdm = new Random();
		int num = 0;
		int number[] = new int[6];
		for (int i = 0; i < 6; i++) {
			num = rdm.nextInt(45) + 1;
			boolean compare = Compare(number, num, i);
			if (compare == true) {
				i--;
				System.out.println("다시 뽑습니다.");
				continue;
			} else {
				number[i] = num;
			}
		}
		for (int k : number) {
			System.out.println(k);
		}
	}

	public static boolean Compare(int[] number, int num, int cnt) {
		boolean com = false;
		for (int i = 0; i <= cnt; i++) {
			if (number[i] == num) {
				com = true;
				break;
			}
		}
		return com;
	}

}
