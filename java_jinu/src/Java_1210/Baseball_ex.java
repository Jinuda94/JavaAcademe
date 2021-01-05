package Java_1210;

import java.util.Random;
import java.util.Scanner;

public class Baseball_ex {

	public static void main(String[] args) {
		/*투수 속도 100~150 타자히트확률 100이면 100프로 150 10프로*/
		Random rdm = new Random();
		while(true) {
			int array[] = new int[51];
			int per = 0; //확률저장
			int pitcher = rdm.nextInt(9) + 1;
			Scanner sc = new Scanner(System.in);
			System.out.println("칠 번호 선택해주세요 1~9");
			int hitter = sc.nextInt();
			int speed = rdm.nextInt(51) + 100;
			System.out.println("구속:"+speed);
			for(int i=0; i<=50; i++) {
				array[i] = 100-(1*i);	
			}
			for(int i=0; i<=50; i++) {
				if(speed-100==i) {
					System.out.println("칠 확률:"+array[i]+"%");
					per=array[i];			
				}
			}
			double per_d = (double) per; //확률 double형으로 변환
			per_d = per_d*1/100;
			
			if(pitcher==hitter) {
				double hitter_hit = Math.random();
				if(hitter_hit>per_d) {
					System.out.println("같은방향 스트라이크입니다.");
				} else {
					System.out.println("안타입니다.");
					break;
				}
				
						
			} else {
				System.out.println("다른방향 스트라이크입니다.");
			}
		}
		
		

	}

}
