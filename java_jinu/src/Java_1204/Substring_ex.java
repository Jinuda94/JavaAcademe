package Java_1204;

public class Substring_ex {

	public static void main(String[] args) {
		String num_str = "AB345";
		String num_str1 = "12BCD";
		String num_char = "ABC";

		/* 원하는 문자 잘라내기 */
		String num_str_s = num_str.substring(2);
		System.out.println(num_str_s);
		String num_str1_s = num_str1.substring(0, 2);
		System.out.println(num_str1_s);
		String num_char_s = num_char.substring(2);
		System.out.println(num_char_s);

		/* int형으로 변환 */
		int num_str_n = Integer.parseInt(num_str_s);
		System.out.println(num_str_n);
		int num_str1_n = Integer.parseInt(num_str1_s);
		System.out.println(num_str1_n);

		/* string을 char로 변환 */
		char num_char_n = num_char_s.charAt(0);
		System.out.println(num_char_n);

		String sum = num_str_s + num_str1_s + num_char_s; // 문자그대로 합치는 코드
		int sum_1 = num_str_n + num_str1_n + num_char_n; // 숫자 더하는 코드

		System.out.println("문자합치기 : " + sum);
		System.out.println("숫자로 변환해 더하기 : " + sum_1);
	}

}
