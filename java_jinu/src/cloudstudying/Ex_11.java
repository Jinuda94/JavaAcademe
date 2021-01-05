package cloudstudying;

public class Ex_11 {
	public static void printSquare(int x) {
		System.out.println(x*x);
	}

	public static void main(String[] args) {
//		printSquare("hello");   --->매개변수 int형에 문자를 넣어서 오류(타입 불일치)
//		printSquare(5.5);   --->매개변수 int형에 소숫점을 넣어서 오류
		printSquare(5); //오류수정

	}

}
