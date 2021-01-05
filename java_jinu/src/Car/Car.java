package Car;

public class Car{
	Color color_c = new Color("red");
	String color = color_c.getColor();
	
	Tire[] tires = {
			new Tire("FRONT-L", 6),
			new Tire("FRONT-R", 2),
			new Tire("REAR-L", 3),
			new Tire("REAR-R", 4)
	};

	public int run() {
		System.out.println("["+color+"차가 달립니다.]");
		for(int i=0; i<tires.length; i++) {		
			if(tires[i].roll()==false) { 
				stop(); 
				return (i+1); 
			} 
		}
		return 0;
	}
	
	public void stop() {
		System.out.println("["+color+"차가 정지합니다..]");
	}
}

