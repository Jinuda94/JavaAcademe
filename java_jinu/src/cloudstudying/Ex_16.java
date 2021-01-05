package cloudstudying;

public class Ex_16 {

	public static void main(String[] args) {
		for(int i = 2; i<=9; i++) {
			System.out.println(i+"단");
			for(int j=1; j<=9; j++) {
				int result = i*j;
				System.out.printf("%d x %d = %d\n",i,j,result);
				
			}
		}

	}

}
