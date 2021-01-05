package Java_1215;

import java.util.ArrayList;
import java.util.Scanner;

public class Method_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("글자 입력");
		String str = sc.nextLine();
		int str_leng = leng(str);
//		String str_array[] = new String[str_leng];
//		str_array = sub(str_leng, str);
		ArrayList<String>str_array = new ArrayList<String>();
		str_array = sub(str);
		print(str_array);
		
	}
	
	public static int leng(String str) {
		int count = str.length();
		return count;
		
	}
	
	public static ArrayList<String> sub(String str) {
//		String str_array[] = new String[length];
		ArrayList<String>str_array = new ArrayList<String>();
		for(int i=0; i<str.length(); i++) {
//		str_array[i] = str.substring(i,i+1);
		str_array.add(i,str.substring(i,i+1));
		}
		return str_array;
		
	}
	
	public static void print(ArrayList<String> array) {
		for (String k : array) {
			System.out.println(k);
		}
	}
	
}
