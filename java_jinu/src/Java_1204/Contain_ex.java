package Java_1204;

public class Contain_ex {

	public static void main(String[] args) {

		String str = "Yang!Jung";

		boolean con = str.contains("yang"); //"yang"이란 문자가 str에 있는지 확인 있으면 true 반환 없으면 false 반환
		System.out.println("Yang 값이 있는가?:" + con);

		if (str.indexOf("!") != -1 || str.indexOf("%") != -1 || str.indexOf("#") != -1 || str.indexOf("*") != -1) {
			System.out.println("다시 입력해주세요.");
		}

		int i = str.indexOf("!"); //"!"의 위치를 반환 없으면 '-1'반환
		System.out.println("indexof의 인덱스 값: " + i);

	}

}
