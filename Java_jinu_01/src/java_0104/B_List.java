package java_0104;

import java.util.Scanner;

public class B_List {
	private B[] bs;
	private int current;

	public B_List() {
		this.bs = new B[3];
		this.current = 0;
	}

	public void input() {
		int num_1;
		int num_2;
		int num_3;
		int num_4;
		int result;
		String op;
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 숫자 입력");
		num_1 = sc.nextInt();
		System.out.println("두번째 숫자 입력");
		num_2 = sc.nextInt();
		System.out.println("세번째 숫자 입력");
		num_3 = sc.nextInt();
		System.out.println("네번째 숫자 입력");
		num_4 = sc.nextInt();
		System.out.println("연산자 입력:(+-*/)");
		op = sc.next();

		B b = new B();
		b.setNum_1(num_1);
		b.setNum_2(num_2);
		b.setNum_3(num_3);
		b.setNum_4(num_4);
		b.setOp(op);

		if (this.bs.length == this.current) {
			B[] temp = new B[this.bs.length + 5];
			for (int i = 0; i < this.bs.length; i++) {
				temp[i] = this.bs[i];

			}
			this.bs = temp;
		}

		this.bs[this.current] = b;
		b.setResult(oper());
		this.bs[this.current] = b;
		this.current++;
	}

	public void print() {
		for (int i = 0; i < this.current; i++) {
			B b = this.bs[i];
			int num_1 = b.getNum_1();
			int num_2 = b.getNum_2();
			int num_3 = b.getNum_3();
			int num_4 = b.getNum_4();
			String op = b.getOp();

			System.out.println(num_1 + op + num_2 + op + num_3 + op + num_4);
			System.out.println("결과: " + b.getResult());
			System.out.println("-----------------------------");
		}
	}

	private int oper() {
		int num_1 = this.bs[this.current].getNum_1();
		int num_2 = this.bs[this.current].getNum_2();
		int num_3 = this.bs[this.current].getNum_3();
		int num_4 = this.bs[this.current].getNum_4();
		int result = 0;

		switch (this.bs[this.current].getOp()) {
		case "+":
			result = num_1 + num_2 + num_3 + num_4;
			break;
		case "-":
			result = num_1 - num_2 - num_3 - num_4;
			break;
		case "*":
			result = num_1 * num_2 * num_3 * num_4;
			break;
		case "/":
			result = num_1 / num_2 / num_3 / num_4;
			break;

		}

		return result;

	}

}
