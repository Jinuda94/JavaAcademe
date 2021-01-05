package Java_1218;

public class Account {
	private int balance;
	final static int MIN_BALANCE = 0;// 최솟값
	final static int MAX_BALANCE = 1000000;// 최댓값

	public Account() {

	}

	public void setBalance(int balance) {
		if (balance > MIN_BALANCE && balance < MAX_BALANCE) {

			this.balance = balance;

		}

	}// balance 필드 값 변경

	public int getBalance() {
		return balance;
	}// balance 필드 값 리턴

}
