package Java_1217;

public class Ex1_my {
static int bus_card = 5000;
	public static void main(String[] args) {
		
		//버스
		Ex1_bus bus = new Ex1_bus();
		bus_card = bus.reder(bus_card);
		System.out.println("잔액: "+bus_card);
		
		//엘베
		int floor = 5;
		Ex1_Elevaitor el = new Ex1_Elevaitor(floor);
		el.move(7);
		
		

	}

}
