package Java_1202;
import java.util.Scanner;

public class If_test_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번쨰 숫자를 입력하시오.");
		int i=sc.nextInt();
		System.out.println("두번쨰 숫자를 입력하시오.");
		int j=sc.nextInt();
		System.out.println("세번쨰 숫자를 입력하시오.");
		int k=sc.nextInt();
		
		int mul = i*j;
		
		
		if(mul%2==0) {
			double div=(double)mul/(double)k;
			double per = Double.parseDouble(String.format("%.2f",div));
			System.out.println("나눈 값: "+per);
		}else {
			System.out.println("곱한 값: "+mul);
		}
		
		
		
	}

}
