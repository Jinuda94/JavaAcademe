package Java_1216;

public class Try_catch_ex1 {

	public static void main(String[] args) {
		String str = "ABCDE";
		String s = null;
		int[] b = new int[2];

		try {
			int a = 100 / 0; // 산수오류 (ArithmeticException) 0으로 나눌때 발생
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		try {
			s = s.toUpperCase(); // 대문자로 변경하는 것이나 s에 null값을 넣었으므로 NullPointerException 발생
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		try {
			b[3] = 10; //범위 밖 배열 첨자 지정
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		try {
			for (int i = 0; i <= str.length(); i++) {
				String sub = str.substring(i, i + 1);
			} // IndexOutOfBoundsException(범위 밖의 배열 첨자 지정)
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
