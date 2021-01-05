package cloudstudying;

public class Ex_10 {
	public static void printSquare(int x) {
		System.out.println(x*x);
	}
	public static void main(String[] args) {
		int value = 2;
		System.out.println(value);
		printSquare(value); //매개변수 value를 넣어 printsquare 메소드를 불러와 쓴다.static을 선언하여 인스턴스 생성안해도 사용가능
		printSquare(3);
		printSquare(value*2);
	
	}
}
