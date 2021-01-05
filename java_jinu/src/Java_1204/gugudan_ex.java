package Java_1204;

public class gugudan_ex {

	public static void main(String[] args) {
		int result = 0;
		
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				result=i*j;
				if(result>=10) {
					System.out.print(i+" X "+j+" = "+result+"  ");			
				} else {
					System.out.print(i+" X "+j+" = "+result+"   ");
				}
				
			}
			System.out.println();
		}

	}

}
