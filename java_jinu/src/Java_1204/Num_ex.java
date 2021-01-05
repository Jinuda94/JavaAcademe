package Java_1204;

public class Num_ex {

	public static void main(String[] args) {
		
		String str1 = "AB123";
		String str2 = "AB34B";
		int idx = 0;
		
		for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			System.out.println("CharAt: "+c);
			int cn = c;
			System.out.println("숫자 변환: "+cn);
			
			if(cn>=48&&cn<=57) {
				idx = i;
				System.out.println(idx);
				break;
			}
		}
		String sub = str1.substring(idx, str1.length());
		System.out.println(sub);

	}

}
