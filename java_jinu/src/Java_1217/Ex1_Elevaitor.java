package Java_1217;

public class Ex1_Elevaitor {
	static int floor = 0;
	
	public Ex1_Elevaitor(int floor) {
		this.floor = floor; //현재 층수 입력받아 초기화
	}
	
	public static void move(int hope_f) {
		floor = hope_f;
		System.out.println(floor+"층에 도착하였습니다.");
		
		
	}
	
	
}
