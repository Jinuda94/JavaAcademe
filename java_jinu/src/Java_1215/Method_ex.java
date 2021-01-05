package Java_1215;

public class Method_ex {

	public static void main(String[] args) {
		int i = 10;
		one(i);

	}
	
	public static void one(int i){
		i = i+10;
		two(i);
	}
	
	public static void two(int i){
		i = i+10;
		three(i);
	}
	
	public static void three(int i){
		i = i+10;
		four(i);
	}
	
	public static void four(int i){
		i = i+10;
		System.out.println("i = "+i);
	}

}
