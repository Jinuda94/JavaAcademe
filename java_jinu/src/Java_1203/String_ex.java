package Java_1203;
import java.util.Scanner;

public class String_ex {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("글자 입력하시오.");
//		String a = sc.next();
//		String s ="안녕하세요";
//		System.out.println(s);
//		System.out.println(a);
		
		String a = "ABCD";
		String b = new String("ABCD");
		
		System.out.println(a);
		System.out.println(b);

		if(a==b) {
			System.out.println("둘은 같다.");
		} else {
			System.out.println("같지 않다.");
		}
		
	}

}
