package java_1221;

abstract class Car {
	protected String color;
	int speed = 0;

	void setSpeed(int speed) {
		this.speed = speed;

	}

}

class Sedan extends Car {

	void setSpeed(int speed) {
		if (speed > 100) {
			this.speed = speed / 10;
		} else {
			this.speed = super.speed;
		}

	}

	void setColor(String color) {
		this.color = color;

	}

}

class Ex12_05 {
	public static void main(String[] args) {

		Sedan sedan1 = new Sedan();

		sedan1.setSpeed(50);
		sedan1.setColor("빨강");
		System.out.println("승용차 속도==>" + sedan1.speed);
		System.out.println("승용차 색상==>" + sedan1.color);

	}
}