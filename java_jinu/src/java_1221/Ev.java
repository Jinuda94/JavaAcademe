package java_1221;

import java.util.Random;

public class Ev {
	int floor;
	int weight;
	int max_weight;
	int hope_floor;
	
	public Ev(int weight) {
		Random ram = new Random();
		this.floor = ram.nextInt(10)+1;
		this.weight = weight;
		this.max_weight = 100;
	}
	

	public int getFloor() {
		return floor;
	}

	public void setHope_floor(int hope_floor) {
		this.hope_floor = hope_floor;
	}
	
	public void up() {
		if(weight<=max_weight) {
			floor = hope_floor;
//			System.out.println(floor+"층에 도착했습니다.");
		} else {
			System.out.println("정원 초과입니다.");
		}
			
		
	}
	
	public void down() {
		if(weight<=max_weight) {
			floor = hope_floor;
//			System.out.println(floor+"층에 도착했습니다.");
		} else {
			System.out.println("정원 초과입니다.");
		}
			
		
	}
	
	
	

}
