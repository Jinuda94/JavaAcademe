package Java_1216;

import java.util.ArrayList;
import java.util.Scanner;

public class Class_ex_me {

	public static void main(String[] args) {
		/*1.스마트폰*/

		
		/*스마트폰*/
		System.out.println("스마트폰을 사용합니다.");
		Class_ex_smartphone s_p = new Class_ex_smartphone();
		String time = s_p.time();
		System.out.println(time);
		ArrayList<String> phone_book = new ArrayList<String>();
		ArrayList<String> phone_book_s = new ArrayList<String>();
		phone_book.addAll(s_p.ph_book(phone_book));
		System.out.println(phone_book);
		phone_book_s.addAll(phone_book);
		phone_book.clear();
		phone_book.addAll(s_p.ph_book(phone_book_s));
		System.out.println(phone_book);
		
		
		

		
		
	}

}
