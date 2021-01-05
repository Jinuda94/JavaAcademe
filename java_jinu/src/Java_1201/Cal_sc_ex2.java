package Java_1201;
import java.util.Scanner;

public class Cal_sc_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 숫자를 입력하세요.");
		int i = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int j = sc.nextInt();
		System.out.println("세번째 숫자를 입력하세요.");
		int k = sc.nextInt();

		int sum = i + j;
		int sub = sum - k;
		int rem = sub % 5;

		System.out.println("더한 값: " + sum);
		System.out.println("뺀 값: " + sub);
		System.out.println("나머지: " + rem);

	}

}
