package Java_1208;

import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter string of text");
		String b = sc.nextLine();
		String c[] = b.split("@");
		System.out.println(c.length);
		for(int i = 0; i<c.length; i++) {
			System.out.println(c[i]);
		}

	}

}
