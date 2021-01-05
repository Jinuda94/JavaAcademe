package Java_1210;

import java.util.ArrayList;

public class ArrayList_ex {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		String str ="ABCDEF";
		for(int i =0; i<str.length(); i++) {
			list.add(str.substring(i,i+1));
			System.out.println(list);
		}
		
//		list.add(1,"d"); //앞 index 뒤 추가값
//		list.remove(1); //index 1 제거
//		list.clear(); //모두제거
		
		for(String s : list) {//for문을 통한 전체출력
			System.out.println(s);
		}
		
		System.out.println(list.get(0)); //index 0 의 데이터값 얻어와서 출력
		 
	}

}
