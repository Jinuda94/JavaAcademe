package Java_1215;

public class Men {

	public static void main(String[] args) {
		Identify id = new Identify();
		int age = id.age("LEE");
		System.out.println(age);
		String job[] = new String[5];
		job = id.job();
		for(String k : job) {
			System.out.println(k);
		}

	}

}
