package Java_1215;

public class Car_ex {

	public static void main(String[] args) {
		Car car = new Car();
		
		String car_nm = car.model;
		
		System.out.println(car_nm);
		
		System.out.println(car.speed);
		car.speed = 400;
		System.out.println(car.speed);
		
		Car_extend ce = new Car_extend(); //종속된 클래스 불러오기
		String model_1 =ce.model;

		System.out.println(model_1);
	}

}
