package Java_1208;

public class Array_ex {

	public static void main(String[] args) {
		int i [] =  {10,20,30,40,50,60};
		int j= 5;
		int sum =0;
		int leng = i.length;
		for(int k = 0; k<leng; k++) {
			sum = i[k]+j;
			System.out.println("배열합계 :"+sum);
		}

	}

}
