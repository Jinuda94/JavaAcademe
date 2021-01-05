package Java_1204;

public class Loop_char {

	public static void main(String[] args) {
		
		String str = "ABCDEF";
		
		char c = str.charAt(1);
		System.out.println("CharAt :"+c);
		

//		글자수 str.length()
//		글자자르기 substring
		
		for(int i=0; i<=str.length(); i++) {
			System.out.println(str.substring(i)); 
		}

	}

}
