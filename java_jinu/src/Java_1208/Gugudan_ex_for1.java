package Java_1208;


public class Gugudan_ex_for1 {

	public static void main(String[] args) {
		int j=2;
		for(int i=1; i<=9; i++) {
			
			int result = j * i;
			if(i==1) {
				System.out.println(j+"단");
			}
			System.out.println(j+" X "+i+" = "+result);
			
			
			
			if(i==9) {
				i=0;
				j++;
				System.out.println("-------------------------");
				
			}
			if(j==10) {
				break;
			}
			
			
		}

	}

}
