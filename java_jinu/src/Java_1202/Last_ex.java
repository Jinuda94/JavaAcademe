package Java_1202;
import java.util.Scanner;

public class Last_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("환전할 금액을 입력하세요.");
		int won=sc.nextInt();
		System.out.println("내가 환전할 돈: "+won);
		System.out.println("환율을 입력하세요.");
		double dollar=sc.nextDouble();
		System.out.println("환율: "+dollar);
		
		double exchange = (double)won/dollar;
		double change = (double)won%dollar;
		int exchange_a = (int)Math.floor(exchange);
		int change_a = (int)Math.floor(change);
		
		System.out.println(exchange_a+"달러 환전되었습니다.");
		System.out.println("환전이 불가한 잔액은 "+change_a+"원 입니다.");
		
		
		

	}

}
