package Java_1204;

public class indexof_ex {

	public static void main(String[] args) {

		String str1 = "AB0123456789";
		String str2 = "AB34B";

		for (int i = 0; i < str1.length(); i++) {
			String str1_s = str1.substring(i, i + 1);
//			System.out.println(str1_s);
			char c = str1_s.charAt(0);
			
			/*isDigit함수를 이용한 숫자판별*/
			if(Character.isDigit(c)==true) {
				System.out.println(c + "숫자 입니다.");
			} else {
				System.out.println(c);
			}
			
			/*아스키코드를 이용한 숫자판별*/
//			if(c>=48&&c<=57) {
//				System.out.println(str1_s + "숫자 입니다.");
//			} else {
//				System.out.println(c);
//			}
		}
	
		System.out.println("-----------------------------------------");
		
		for (int i = 0; i < str2.length(); i++) {
			String str2_s = str2.substring(i, i + 1);
//			System.out.println(str2_s);
			char c = str2_s.charAt(0);
			
//			/*isDigit함수를 이용한 숫자판별*/
//			if(Character.isDigit(c)==true) {
//				System.out.println(str2_s + "숫자 입니다.");
//			} else {
//				System.out.println(c);
//			}
			
			/*아스키코드를 이용한 숫자판별*/
			if(c>=48&&c<=57) {
				System.out.println(str2_s + "숫자 입니다.");
			} else {
				System.out.println(c);
			}
		}

	}

}
