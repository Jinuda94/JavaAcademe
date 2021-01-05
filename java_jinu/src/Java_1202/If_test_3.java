package Java_1202;
import java.util.Scanner;

public class If_test_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번쨰 숫자를 입력하시오");
		int i= sc.nextInt();
		System.out.println("두번쨰 숫자를 입력하시오");
		int j= sc.nextInt();
		
		int sum=i+j;
		double div=0;
		if(sum>100) {
			System.out.println("세번째 숫자를 입력하시오");
			int k=sc.nextInt();
			div=sum/k;
			double per = Double.parseDouble(String.format("%.2f",div));
			System.out.println("세번째 숫자로 나눈 값: "+per);
		}else if(sum>60) {
			div=sum/6;
			double per = Double.parseDouble(String.format("%.2f",div));
			System.out.println("6으로 나눈 값: "+per);
		}else if(sum>50) {
			div=sum/3;
			double per = Double.parseDouble(String.format("%.2f",div));
			System.out.println("3으로 나눈 값: "+per);
		}else {
			System.out.println("50보다 작습니다.");
		}
		

	}

}


