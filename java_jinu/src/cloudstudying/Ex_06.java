package cloudstudying;
import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시급입력");
		int pay = sc.nextInt();
		System.out.println("일한 시간 입력:");
		int time = sc.nextInt();
		sc.close();
		
		System.out.println("급여: "+pay*time);

	}

}
