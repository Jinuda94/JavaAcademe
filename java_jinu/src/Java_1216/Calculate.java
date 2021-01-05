package Java_1216;

public class Calculate {
	static int i;
	static int j;
	static String s;
	
	public Calculate(int i, int j, String s) {
		this.i = i; //생성자에서 초기화
		this.j = j;
		this.s = s;
					
	}
	
	public static int cal () {
		int result = 0;
		switch(s) {
		case "+" : result = i+j; break;
		case "-" : result = i-j; break;
		case "*" : result = i*j; break;
		case "/" : result = i/j; break;
		}
		
		return result;
	}


}
