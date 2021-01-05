package Java_1209;

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		/*
		 * 1.글자를 입력받는다. 
		 * 2.substring으로 2글자씩 자른 후 배열에저장
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("글자를 입력해주세요.");
		String str = sc.nextLine();
		String str_1 = " ";
		String str_s[] = new String[100];


		/*공백추가*/
//		if (str.length() % 2 == 1) {
//			str = str + str_1;	
//		}
//		
//		for (int i = 0; i < str.length(); i++) {
//
//			str_s[i] = str.substring(i, i + 2);
//			System.out.println(str_s[i]);
//			i++;
//		}
		
		/*조건문으로 잘라내기*/
		for (int i = 0; i < str.length(); i++) {
            if (str.length() - i == 1) {
                str_s[i] = str.substring(i, i + 1);
                System.out.println(str_s[i]);
            } else {
                str_s[i] = str.substring(i, i + 2);
                System.out.println(str_s[i]);
                i++;
            }
        }
	}

}
