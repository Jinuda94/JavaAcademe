package Java_1209;

public class Book_ex1 {

	public static void main(String[] args) {
		/*for문 while문으로 바꾸기*/
		int[][] aa = new int[3][4];

		int i=0;
		int k;
		
		int val = 1;
		
		while(i<3) {
			k=0;
			while(k<4) {
				aa[i][k] = val;
				val++;
				System.out.printf("aa[%d][%d]=%d\n",i,k,aa[i][k]);
				k++;
				
			}
			i++;
		}
//		for (i = 0; i < 3; i++) {
//			for (k = 0; k < 4; k++) {
//				aa[i][k] = val;
//				val++;
//				System.out.printf("aa[%d][%d]=%d\n",i,k,aa[i][k]);
//			}
//		}

		

	}

}
