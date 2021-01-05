package cloudstudying;

public class Ex_12 {
	public static void printSquare(double x) {
		System.out.println(x*x);
	}

	public static void main(String[] args) {
		printSquare(3); // double형은 int형보다 데이터타입이 크므로 큰곳으로는 자동으로 형변환하여 컴파일해서 오류x

	}

}
