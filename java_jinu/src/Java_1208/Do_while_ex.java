package Java_1208;

public class Do_while_ex {
	
	public static void main(String[] args) {
		int i = 0;
		while(i<=5) {
			System.out.println(i+"ssz");
			if(i==4) {
				continue;
			}
			System.out.println(i+"ss");
			i++;
		}

	}

}
