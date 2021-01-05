package Java_1204;

public class Loop_ex1 {

	public static void main(String[] args) {
		int j = 0;

		for (int i = 0; i <= 100; i++) {

			if(i%2==0){	
				j += i;
				System.out.println(j);
			}//짝수 합
		}
		System.out.println("1~100의 합은 :" + j);
	}

}
