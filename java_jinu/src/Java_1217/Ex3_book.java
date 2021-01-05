package Java_1217;

public class Ex3_book {
	static String tittle;
	private static int page;
	static String note;
	static int r_page;

	public Ex3_book(int r_page) {
		this.tittle = "채식주의자";
		this.page = 5;
		this.note = "채식주의자는 !";
		this.r_page = r_page;
	}
	
	public int get_page() {
		int page = this.page;
		return page;
		
	}

	public static void read() {
		String read = "";
		for (int i = 0; i < note.length(); i++) {
			read = note.substring(i, i + 1);
			System.out.print(read);
		}
		System.out.println();

	}

	public static int n_page() {

		if (r_page < page) {
			r_page++;
		}

		return r_page;
	}

}
