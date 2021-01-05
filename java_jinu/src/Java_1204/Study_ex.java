package Java_1204;

public class Study_ex {

	public static void main(String[] args) {
		/*
		 * str의 글자를 한글자씩 빼서 숫자로 바꾼 후 char c와 곱하세요.
		 * 곱한 값들을 모두 더하세요.
		 */

		String str = "1234";
		char c = 'E';
		int cn = c;
		System.out.println(c+"를 숫자로 변환 -> "+cn);
		int sum = 0;
		int mul = 0;
		System.out.println("-------------------");
		
//		for (int i = 0; i < str.length(); i++) {
//			char str_c = str.charAt(i);
//			int str_cn = str_c;
//			System.out.println(str_c+"를 숫자로 변환 -> "+str_cn);
//			mul = cn * str_cn;
//			System.out.println(cn+" X "+str_cn+" = "+mul);
//			System.out.print(sum+" + "+mul+" = " );
//			sum += mul;
//			System.out.println(sum);
//			System.out.println("-------------------");
//			
//		}
		
		for (int i = 0; i < str.length(); i++) {
			String str_s = str.substring(i,i+1);
			int str_sn = Integer.parseInt(str_s); 
			System.out.println(str_s+"를 숫자로 변환 -> "+str_sn);
			mul = cn * str_sn;
			System.out.println(cn+" X "+str_sn+" = "+mul);
			System.out.print(sum+" + "+mul+" = " );
			sum += mul;
			System.out.println(sum);
			System.out.println("-------------------");
			
		}
		
		System.out.println("곱한 값들을 모두 더한 값: "+sum);

	}

}
