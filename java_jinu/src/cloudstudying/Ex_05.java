package cloudstudying;

public class Ex_05 {

	public static void main(String[] args) {
		int d_price = 8000; //돈까스
		int k_price = 6000; //칼국수
		int m_price = 5000; //만두
		
		int d_num = 16;
		int k_num = 8;
		int m_num = 1;
		
		
		
		System.out.println("돈가스 X "+d_num+" = "+d_price*d_num);
		System.out.println("칼국수 X "+k_num+" = "+k_price*k_num);
		System.out.println("왕만두 X "+m_num+" = "+m_price*m_num);
		System.out.println("===============================");
		int sum = d_price*d_num + k_price*k_num +m_price*m_num;
		System.out.println("총합: "+sum);
	}

}
