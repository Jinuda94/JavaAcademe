package Java_1215;

public class Ex_4_3 {

	public static void main(String[] args) {
	
		int sum = 0;
		for(int i =0; i<12; i++) {
			for(int j=0; j<i; j++) {
				sum += j;
			}
		}
		
		System.out.println(sum);

	}

}
