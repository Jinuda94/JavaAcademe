package Java_1216;

import java.util.Scanner;

public class Method_ex {

	public static void main(String[] args) {
		String str = scan();
		int leng = leng(str);
		String sub[] = new String[leng];
		sub = sub(leng,str);
		for(String k:sub) {
			System.out.println(k);
		}

	}
	
	public static String scan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("글자입력");
		String str = sc.nextLine();
		sc.close();
		return str;
	}
	
	public static int  leng(String str) {
		int leng = str.length();
		return leng;
	}
	
	public static String[] sub(int leng,String str) {
		String sub[] = new String[leng];
		for(int i = 0; i<leng; i++) {
			sub[i] = str.substring(i,i+1);
		}
		return sub;
	}

}
