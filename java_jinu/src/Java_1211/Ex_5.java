package Java_1211;

import java.util.Random;
import java.util.Scanner;

public class Ex_5 {

	public static void main(String[] args) {
		/*
		 * 1.돌릴 갯수 정하기 2.Random 숫자 받아서 알파벳으로바꾸기 3.알파벳 대문자 65~90 소문자a~z 97~122 91~96예외처리
		 */
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println("몇번 할건지 입력하시오.");
		int num = sc.nextInt();

		while (true) {

			Random rdm = new Random();
			int alphabet_r = rdm.nextInt(58) + 65; //65~122사이의 숫자 랜덤
			System.out.println("뽑힌 숫자:"+alphabet_r);
			
			if(alphabet_r>=91 && alphabet_r<=96) {
				System.out.println("91~96사이의 숫자가 나왔습니다. 다시 뽑습니다.");
				continue;
			}//91~96숫자 나오면 다시 while문 돌아가기

			char alphabet = (char) alphabet_r; //int형 char형 변환
			
			String array_a[] = new String[num]; //배열 초기화
			array_a[i] = Character.toString(alphabet); //배열안에 Char형문자를 String형으로 변환해 넣기
			System.out.println((i+1) + ":" + array_a[i]);

			if(i==(num-1)) {
				break;
			}
			
			i++;
		}

	}
}
