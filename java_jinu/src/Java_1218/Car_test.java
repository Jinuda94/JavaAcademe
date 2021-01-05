package Java_1218;

public class Car_test {
	

	public static void main(String[] args) {
		Car ca1 = new Car("검정색",4000,4);
		System.out.print(ca1.Brand+"|");
		System.out.print(ca1.color+"|");
		System.out.print(ca1.cc+"|");
		System.out.print(ca1.door+"|");
		System.out.println();
		System.out.println("-------------------");
	
		
		Car ca2 = new Car("노란색");
		System.out.print(ca2.Brand+"|");
		System.out.print(ca2.color+"|");
		System.out.print(ca2.cc+"|");
		System.out.print(ca2.door+"|");
		System.out.println();
		System.out.println("-------------------");
		
		
		Car ca3 = new Car(2);
		System.out.print(ca3.Brand+"|");
		System.out.print(ca3.color+"|");
		System.out.print(ca3.cc+"|");
		System.out.print(ca3.door+"|");
		System.out.println();
		System.out.println("-------------------");
		
		
		Car ca4 = new Car();
		System.out.print(ca4.Brand+"|");
		System.out.print(ca4.color+"|");
		System.out.print(ca4.cc+"|");
		System.out.print(ca4.door+"|");
		System.out.println();
		System.out.println("-------------------");
		
		//static예제
		Car c =new Car();
		int x= c.a();
		System.out.println(x);
		x=c.a();
		System.out.println(x);
		Car c1 =new Car();
		x=c1.a();
		System.out.println(x);
		
		
		
	}
	


}
