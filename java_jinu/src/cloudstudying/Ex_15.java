package cloudstudying;

public class Ex_15 {

	public static void printPay(double basePay, int hours) {
		double weekpay;

		if (hours > 40) {
			weekpay = basePay * hours * 1.5;
		} else {
			weekpay = basePay * hours;
		}
		String str = String.format("%.1f", weekpay);
		if (basePay < 8) {
			System.out.println("최저시급 불이행");
		} else if (hours > 60) {
			System.out.println("제한 근무시간 초과.");
		} else {
			System.out.println("$" + str);
		}

	}

	public static void main(String[] args) {
		printPay(7.50, 35);
		printPay(8.20, 47);
		printPay(10.00, 73);
	}
}
