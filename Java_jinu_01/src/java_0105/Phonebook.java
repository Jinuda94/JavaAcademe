package java_0105;

import java.util.ArrayList;
import java.util.Scanner;

public class Phonebook {
//	private Data[] book;
	private ArrayList<Data> book = new ArrayList<Data>();
	private int cnt;

	public Phonebook() {
//		book = new Data[100];
		cnt = 0;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);

		Data d = new Data();
		System.out.print("이름 입력: ");
		d.setName(sc.next());
		System.out.print("번호 입력: ");
		d.setNumber(sc.next());
		System.out.print("e-mail 입력:");
		d.setEmail(sc.next());

//		if (book.length == cnt) {
//			Data[] temp = new Data[book.length + 1];
//			for (int i = 0; i < book.length; i++) {
//				temp[i] = book[i];
//
//			}
//			book = temp;
//		}

		book.add(d);
		cnt++;

		System.out.println("-----------------------------");

	}

	public void print() {
		for (int i = 0; i < cnt; i++) {
//			Data d = book[i];
//			String name = d.getName();
//			String number = d.getNumber();
//			String email = d.getEmail();
//			System.out.println(book.get(i).getNumber());
			String name = book.get(i).getName();
			String number = book.get(i).getNumber();
			String email = book.get(i).getEmail();

			System.out.println(i + 1 + "번 연락처");
			System.out.println("이름: " + name);
			System.out.println("번호: " + number);
			System.out.println("E-mail: " + email);
			System.out.println("-----------------------------");
		}
	}

	public void print(int num) {

//			Data d = book[i];
//			String name = d.getName();
//			String number = d.getNumber();
//			String email = d.getEmail();
//			System.out.println(book.get(i).getNumber());
		String name = book.get(num).getName();
		String number = book.get(num).getNumber();
		String email = book.get(num).getEmail();

		System.out.println(num + 1 + "번 연락처");
		System.out.println("이름: " + name);
		System.out.println("번호: " + number);
		System.out.println("E-mail: " + email);
		System.out.println("-----------------------------");

	}

	public void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 연락처 번호를 입력해주세요.");
		int del_num = sc.nextInt() - 1;
//		for(int i = 0; i<book.length; i++) {		
//		if(book[i]!=null) {
//			book[del_num+i] = book[del_num+i+1];
//		}
//		}

		book.remove(del_num);

		cnt--;

	}
	
	public void delete(int num) {
	
		book.remove(num);

		cnt--;

	}

	public void find() {
		Scanner sc = new Scanner(System.in);
		int cnt_2 = 0;
		System.out.println("찾을 정보의 이름을 입력하세요.");
		String find = sc.next();
		for (int i = 0; i < cnt; i++) {
			if (find.equals(book.get(i).getName())) {
				
				print(i);
				
				System.out.println("연락처 삭제하시겠습니까? 1.Yes 2.No");
				int flag = sc.nextInt();
				
				if(flag==1)
					delete(i);
				
			} else {
				cnt_2++;
			}
		}

		if (cnt_2 == cnt)
			System.out.println(find + "의 연락처가 없습니다.");
		
	}

}
