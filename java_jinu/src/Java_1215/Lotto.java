package Java_1215;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		int L_num[] = new int[6];
		L_num = pick();

		System.out.println("	   당첨번호");
		System.out.println(" -----------------------------");
		System.out.print("| ");
		for (int k : L_num) {
			
			System.out.print(k+" | ");
		}
		System.out.println();
		System.out.println(" -----------------------------");

	}
	
	public static int[] pick() {
		Random rdm = new Random();
		int num [] = new int[6];
		for(int i=0; i<6; i++) {
			num[i] = rdm.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(num[i]==num[j]) {
					i--;
					break;
				}
			}
			
			
		}
		
		return num;
		
		
	}

}
