package Java_1201;
import java.util.Scanner;

public class Cal_sc_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 숫자를 입력하세요.");
		int i = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int j = sc.nextInt();
		System.out.println("세번째 숫자를 입력하세요.");
		int k = sc.nextInt();

		int mul = i * j;
		double per = (double) (k) / (double) (mul) * 100;
		int per_1 = (int) (per);

		System.out.println("첫번째 두번쨰 숫자 곱한 값: " + mul);
		System.out.println("퍼센트: " + per_1 + "%");

	}

}
