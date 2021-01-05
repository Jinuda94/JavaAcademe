package Java_1207;
import java.util.Scanner;

public class Review_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("영문 이름(A~z)을 입력하세요.(띄어쓰기 x)");
		String name = sc.next();
		int sum =0 ;
		
		for(int i=0; i<name.length(); i++) {
			char name_c= name.charAt(i);
			System.out.println(name_c);
			sum += name_c;
		
		}
		System.out.println("이름 합한 값 : "+sum);
		
	

	}

}
