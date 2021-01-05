package Java_1203;
import java.util.Scanner;

public class Lotto_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pick_1 = (int)(Math.random()*45)+1;
		int pick_2 = (int)(Math.random()*45)+1;
		int pick_3 = (int)(Math.random()*45)+1;
		int pick_4 = (int)(Math.random()*45)+1;
		int pick_5 = (int)(Math.random()*45)+1;
		int pick_6 = (int)(Math.random()*45)+1;
		
		if(pick_2==pick_1) {
			pick_2 = (int)(Math.random()*45)+1;
		}
		
		if(pick_3==pick_1 || pick_3==pick_2) {
			pick_3 = (int)(Math.random()*45)+1;
		}
		
		if(pick_4==pick_1 || pick_4==pick_2 || pick_4==pick_3){
			pick_4 = (int)(Math.random()*45)+1;
		}
		
		if(pick_5==pick_1 || pick_5==pick_2 || pick_5==pick_3 || pick_5==pick_4) {
			pick_5 = (int)(Math.random()*45)+1;
		}
		
		if(pick_6==pick_1 || pick_6==pick_2 || pick_6==pick_3 || pick_6==pick_4 || pick_6==pick_5) {
			pick_6 = (int)(Math.random()*45)+1;
		}
		

		System.out.println("당첨번호는 "+pick_1+","+pick_2+","+pick_3+","+pick_4+","+pick_5+","+pick_6);

	}

}
