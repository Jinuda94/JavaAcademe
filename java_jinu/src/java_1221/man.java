package java_1221;

import java.util.ArrayList;
import java.util.Collections;

public class man {
	public static void main(String[] args) {
		int weight = 40;
		int weight_2 = 50;
		int hope_floor = 10;
		int stay_floor = 3;
		int hope_floor_2 = 8;
		int stay_floor_2 = 5;
		int sum_weight = weight+weight_2;
		
		
		ArrayList<Integer>floor = new ArrayList<Integer>();
		
	
		
	
		Ev ev1 = new Ev(sum_weight);
		Ev ev2 = new Ev(sum_weight);
		
		floor.add(ev1.getFloor());
		
		
		ev1.setHope_floor(hope_floor);
		ev1.up();
		floor.add(ev1.getFloor());
		ev2.setHope_floor(hope_floor_2);
		ev2.up();
		floor.add(ev2.getFloor());
		Collections.sort(floor);
		
		System.out.println(floor.get(0)+"층 입니다.");
		System.out.println(floor.get(1)+"층 입니다.");
	}
	
	
	
}
