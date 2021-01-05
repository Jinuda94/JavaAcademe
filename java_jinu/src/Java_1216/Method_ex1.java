package Java_1216;

import java.util.Random;
import java.util.ArrayList;

public class Method_ex1 {

	public static void main(String[] args) {
		String str = "abcde";
		ArrayList<Integer> result = new ArrayList<Integer>();
		result = leng(str);
		
		System.out.println(str);
		
		for(int k: result) {
			System.out.println(k);
		}
			
		int leng = result.get(0);
		int dice = result.get(1);
		
		System.out.println(leng);
		System.out.println(dice);

	}

	public static ArrayList<Integer> leng(String str) {
		Random rdm = new Random();
		int dice = 0;
		int leng = str.length();
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (leng % 2 == 0) {
			dice = rdm.nextInt(6) + 1;
		} else {
			dice = rdm.nextInt(7) + 1;
		}
		result.add(0,leng);
		result.add(1,dice);

		return result;

	}

	
	



}
