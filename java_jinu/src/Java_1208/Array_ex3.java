package Java_1208;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		String b= sc.nextLine();
		String Array [] = b.split("-| |@"); //() 받으면 다음 배열주소에 저장
		int A_leng = Array.length; //Array 주소 길이
		for(int i = 0; i<A_leng; i++) {
			System.out.println(Array[i]);
			int A_leng_2 = Array[i].length(); //Array[i]의 길이
			for(int j = 0; j<A_leng_2; j++) {
				String Array_s = Array[i].substring(j,j+1); //Array[i]를 한글자씩 쪼갬
				System.out.println(Array_s);
			}
			
		}

	}

}
