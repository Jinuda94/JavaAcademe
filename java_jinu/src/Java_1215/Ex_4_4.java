package Java_1215;

public class Ex_4_4 {

	public static void main(String[] args) {
		int sum = 0;
		int s = -1;
		int num = 0;
	
		for(int i=1; sum<100; i++) {
			if(i%2==0) {
				num = s * i;	
			} else {
				num = i;
			}
			
			sum += num;
			
		
		}
		System.out.println(num);
		System.out.println(sum);

	}

}
