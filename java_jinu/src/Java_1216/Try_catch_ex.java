package Java_1216;

public class Try_catch_ex {

	public static void main(String[] args) {
		int[] aa = new int[3];
		
		try {
			aa[2] = 100 / 0;
			aa[3] = 100;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("무조건 출력");
		}

	}

}
