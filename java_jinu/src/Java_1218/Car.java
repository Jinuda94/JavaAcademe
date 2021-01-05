package Java_1218;

public class Car {
	String Brand = "BENZ";
	String color = "";
	int cc = 0;
	int door = 0;
	int x =10;

	public Car() {
		this("흰색", 2000, 4);
	}//default값
		
	public Car(String color) {
		this(color, 4000, 4);
	}//색만 받았을때
	
	public Car(int door) {
		this("흰색", 2000, door);
	}//문 갯수만 받았을때
	
	public Car(String color,int cc) {
		this(color, cc, 4);
	}//색과 cc만 받았을때
	

	

	public Car(String color,int cc,int door) {
		this.color = color;
		this.cc = cc;
		this.door = door;
	}//전부 받았을때


	public int a() {
		x++;
		return x;
	}
}
