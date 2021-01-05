package java_0104;

public class Ex_A {

	public static void main(String[] args) {
		Ex_C c = new Ex_C();
		c.scan();
		
		System.out.println(c.str);
		System.out.println("결과: "+sum(c));
		
	}

	public static int sum(Ex_C c) {
		int sum = 0;
		for (int i = 0; i < c.str.length(); i++) {
			String str = c.str.substring(i,i+1);
			int num = Integer.parseInt(str);
			sum += num;
		}
		
		return sum;

	}



	
}
