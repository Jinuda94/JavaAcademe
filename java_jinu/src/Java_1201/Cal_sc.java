package Java_1201;
import java.util.Scanner;

public class Cal_sc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		int i = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int j = sc.nextInt();

		int sum = i + j;
		int sub = i - j;
		int mul = i * j;
		double div = (double) i / (double) j;

		System.out.println("덧셈: " + sum);
		System.out.println("뺼셈: " + sub);
		System.out.println("곱하기: " + mul);
		System.out.println("나누기: " + div);

	}

}
