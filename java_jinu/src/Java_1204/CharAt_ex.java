package Java_1204;

public class CharAt_ex {

	public static void main(String[] args) {
		String str1 = "ABC";
		String str2 = "abc";
		char c_1 = ' ';
		char c_2 = ' ';
		int i = 0;

		for (i = 0; i < str1.length(); i++) {
			c_1 = str1.charAt(i);
			System.out.println(c_1);
		}

		for (i = 0; i < str2.length(); i++) {
			c_2 = str2.charAt(i);
			System.out.println(c_2);
		}

		System.out.println(c_1);
		System.out.println(c_2);
		System.out.println(c_1-c_2);
		
		
	}

}
