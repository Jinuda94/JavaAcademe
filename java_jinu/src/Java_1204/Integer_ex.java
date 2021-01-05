package Java_1204;

public class Integer_ex {

	public static void main(String[] args) {

		String str = "1234";

		System.out.println("String형 : " + str);

		int str_n = Integer.parseInt(str);
		int str_n_1 = Integer.valueOf(str); // 같지만 위에꺼 쓰는게 낫다.

		System.out.println("int형 : " + str_n);
		System.out.println("int형 : " + str_n_1);
		
		String sum = 0 + str;
		int sum_1 = 0 + str_n;
		
		System.out.println(sum);
		System.out.println(sum_1);

	}

}
