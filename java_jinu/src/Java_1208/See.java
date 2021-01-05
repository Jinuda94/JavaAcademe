package Java_1208;

public class See {

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			for(int i=0; i<10; i++) {
				if(i==3) {
					continue;
				}
				System.out.println(i);
				
			}
			run=false;
		}

	}

}
