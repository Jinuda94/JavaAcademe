package Java_1204;

public class Loop_ex {

	public static void main(String[] args) {
		String s = "호선";
		int i=0;
		int j=10;
		int sum=0;
		//전위,후위 연산자 차이
		for(i=0; i<5; i++) {
				
			sum=i + ++j;
			
			System.out.println(i+"+"+j+"="+sum);
			
		}
		

	}

}
