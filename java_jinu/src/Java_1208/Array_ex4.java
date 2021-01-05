package Java_1208;

public class Array_ex4 {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, };
		String str = "ABCDE";
		char c =' ';
		c = str.charAt(3);
		int mul = nums[4] * c;
		System.out.println(mul);
		for(int i=0; i<nums.length; i++) {
			int nums_s = nums[i];
			if(nums_s == 4) {
				System.out.println(nums_s);
				break;
			}
		}
		for(int j=0; j<str.length(); j++) {
			c = str.charAt(j);
			if(c=='D') {
				System.out.println(c);
				break;
			}
		}
	}

}
