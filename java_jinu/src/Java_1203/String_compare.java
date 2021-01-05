package Java_1203;

public class String_compare {

	public static void main(String[] args) {

		String str1 = "양정개발센터";
		String str2 = new String("양정개발센터");
		String str3 = "양정개발센터";

		System.out.println("해시코드1:" + str1.hashCode());              
		System.out.println("해시코드2:" + str2.hashCode());
		System.out.println("해시코드3:" + str3.hashCode());
		System.out.println("고유주소1:" + System.identityHashCode(str1));
		System.out.println("고유주소2:" + System.identityHashCode(str2));
		System.out.println("고유주소3:" + System.identityHashCode(str3));
//      변수.hashcode() 와 System.identityHashcode()다른 점은 본질이 다르다..
		
//		문자열을 String 변수에 저장한다는 말은 틀린 표현(일반적으로 int 완 다른 객체이므로)
//		변수는 String 객체를 참조한다.
		boolean compare1 = (str1 == str2); //자바는 기본적으로 문자열을 리터럴이 동일하다면 String 객체를 공유하도록 되어있다.
		boolean compare2 = (str1.equals(str2)); //별도의 String 객체를 생성했으므로,
		boolean compare3 = (str1 == str3); // 동일한 문자열 리터럴로 비교했을 땐 같은 String 객체를 공유 하므로 동
		System.out.println("문자열 비교1:" + compare1);
		System.out.println("문자열 비교2:" + compare2);

		System.out.println("문자열 비교3:" + compare3);
		System.out.println(str1.hashCode());

	}

}
