package Java_1217;

public class Ex1_bus {
	static int discount;
	
	public Ex1_bus() {
		this.discount = 1200;
	}
	
	public static int reder(int bus_card) {
		bus_card -= discount;
		
		return bus_card;
		
	}
	



}
