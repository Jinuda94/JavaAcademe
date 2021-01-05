package java_1229;

public class ATM_main {
	static int card = 100000;

	public static void main(String[] args) {

		ATM_gigi atm = new ATM_gigi(card);
		atm.deposit();
		System.out.println("-----------------------------");
		atm.withdraw();
		System.out.println("-----------------------------");
		atm.lookup();
	}

}
