package Java_1217;

public class Ex2_men {
	static int money = 20000;

	public static void main(String[] args) {

		
		Ex2_burgerking bk = new Ex2_burgerking();
		bk.in();
		money = bk.order(money);
		System.out.println("잔액: "+money);
		bk.out();
		
		
	}


}
