package Java_1210;

import java.util.Scanner;

public class Buger_order_ex {

	public static void main(String[] args) {
		int money = 0;
		String[] m_order = new String[100]; // 내 주문내역 확인 배열
		boolean total_run = true; // 전체메뉴 런
		boolean set_run = false; // 세트메뉴 런
		boolean buger_run = false; // 버거메뉴 런
		boolean side_run = false; // 사이드메뉴 런
		boolean drink_run = false; // 음료메뉴 런
		int i = 0; // 주문내역 번호 사용변수
		int count = 0; //주문수량

		/*전체메뉴*/
		while (total_run) {
			System.out.println("현재 주문내역");
			for(int j=0; j<m_order.length; j++) {
				if(m_order[j]!=null) {
					System.out.println(m_order[j]);
				} 
			}
			System.out.println("---------------------------------");
			System.out.println("총 가격: "+money);
			
			System.out.println("---------------------------------");
			Scanner st = new Scanner(System.in);
			System.out.println("사용하실 메뉴를 선택해주세요.");
			System.out.println("1.세트메뉴 | 2.버거메뉴 | 3.사이드메뉴| 4.음료메뉴 5.주문완료");
			System.out.println("---------------------------------");
			int total = st.nextInt();
			switch (total) {
			case 1:
				set_run = true;
				break;
			case 2:
				buger_run = true;
				break;
			case 3:
				side_run = true;
				break;
			case 4:
				drink_run = true;
				break;
			case 5:
				total_run = false;
				break;
			}//전체메뉴 switch문
			
			
		
			

	
			/* 세트메뉴 주문 */

			while (set_run) {
				Scanner ss = new Scanner(System.in);
				System.out.println("세트메뉴 선택");
				System.out.println("1.새우버거 세트(5000) | 2.불고기버거 세트(4500) | 3.핫크리스피 세트(6000) | 4.AZ버거 세트(7000) | 5.전체메뉴");
				int order_set = ss.nextInt();

				switch (order_set) {
				case 1:
					System.out.println("주문수량을 입력해주세요.");
					count = ss.nextInt();
					m_order[i] = "새우버거 세트(5000)";
					money += 5000;
					i++;
					break;
				case 2:
					m_order[i] = "불고기 세트(4500)";
					money += 4500;
					i++;
					break;
				case 3:
					m_order[i] = "핫크리스피버거 세트(6000)";
					money += 6000;
					i++;
					break;
				case 4:
					m_order[i] = "AZ버거 세트(7000)";
					money += 7000;
					i++;
					break;
				case 5:
					set_run = false;
					break;
					
				}

			} // 세트메뉴 while문 종료

			/* 버거메뉴 주문 */

			while (buger_run) {
				Scanner sb = new Scanner(System.in);
				System.out.println("버거메뉴 선택");
				System.out.println("1.새우버거(3500) | 2.불고기버거(3000) | 3.핫크리스피(4500) | 4.AZ버거(5500) | 5.전체메뉴");
				int order_buger = sb.nextInt();

				switch (order_buger) {
				case 1:
					m_order[i] = "새우버거(3500)";
					money += 3500;
					i++;
					break;
				case 2:
					m_order[i] = "불고기(3000)";
					money += 3000;
					i++;
					break;
				case 3:
					m_order[i] = "핫크리스피버거(4500)";
					money += 4500;
					i++;
					break;
				case 4:
					m_order[i] = "AZ버거(5500)";
					money += 5500;
					i++;
					break;
				case 5:
					buger_run = false;
					break;
				}

			} // 버거메뉴 while문 종료

			/* 사이드메뉴 주문 */

			while (side_run) {
				Scanner si = new Scanner(System.in);
				System.out.println("사이드메뉴 선택");
				System.out.println("1.콘샐러드(1500) | 2.치즈스틱(1500) | 3.포테이토(1000) | 4.포테이토L(1500) | 5.전체메뉴");
				int order_side = si.nextInt();

				switch (order_side) {
				case 1:
					m_order[i] = "콘샐러드(1500)";
					money += 1500;
					i++;
					break;
				case 2:
					m_order[i] = "치즈스틱(1500)";
					money += 1500;
					i++;
					break;
				case 3:
					m_order[i] = "포테이토(1000)";
					money += 1000;
					i++;
					break;
				case 4:
					m_order[i] = "포테이토L(1500)";
					money += 1500;
					i++;
					break;
				case 5:
					side_run = false;
					break;
				}

			} // 사이드메뉴 while문 종료

			/* 음료메뉴 주문 */

			while (drink_run) {
				Scanner sd = new Scanner(System.in);
				System.out.println("음료메뉴 선택");
				System.out.println("1.콜라(1000) | 2.사이다(1000) | 3.환타(1000) | 4.물(500) | 5.전체메뉴");
				int order_drink = sd.nextInt();

				switch (order_drink) {
				case 1:
					m_order[i] = "콜라(1000)";
					money += 1500;
					i++;
					break;
				case 2:
					m_order[i] = "사이다(1000)";
					money += 1500;
					i++;
					break;
				case 3:
					m_order[i] = "환타(1000)";
					money += 1000;
					i++;
					break;
				case 4:
					m_order[i] = "물(500)";
					money += 1500;
					i++;
					break;
				case 5:
					drink_run = false;
					break;
				}

			} // 음료메뉴 while문 종료
		}
	}
}
