package Java_1209;

import java.util.Scanner;

public class Equlas_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("글자를 입력해주세요.");
		String str1 = sc.next();
		System.out.println("비교할 글자를 입력해주세요.");
		String str2 = sc.next();
		boolean a = true;
		a = str1.equals(str2);  //비교문 같으면 true 다르면 false
		
		if(a==true) {
			System.out.println("같은 글자입니다.");
		} else {
			System.out.println("다른 글자입니다.");
		}
		

	}

}
