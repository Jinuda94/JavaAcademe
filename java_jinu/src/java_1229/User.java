package java_1229;

import java.util.Scanner;

public class User {
	private String id;
	private String name;
	private int pass;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}

	public String input() {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		return a;
	}
	
	public void id() {
		do {
			System.out.println("ID를 입력하시오. (1~6글자)");
			this.id = input();
			
			if (id.length()>6)
				System.out.println("ID는 6글자까지만 입력해주세요.");
		} while (id.length()>6);
	}
	
	public void name() {
		do {
			System.out.println("name을 입력하시오. (1~4글자)");
			this.name = input();
			
			if (name.length()>4)
				System.out.println("name은 4글자까지만 입력해주세요.");
		} while (name.length()>4);
		
	}
	
	public void pass() {
		String pass1;
		do {
			System.out.println("passward를 입력하시오. (8자리 이하)");
			pass1 = input();
			this.pass = Integer.parseInt(pass1);
			
			if (pass1.length()>8)
				System.out.println("passward는 8글자까지만 입력해주세요.");
		} while (pass1.length()>8);
		
	}

}
