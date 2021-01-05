package cloudstudying;

public class Ex_04 {

	public static void main(String[] args) {
		String item[] = new String[3];
		int price [] = new int[3];
		item[0] = "한우 꽃등심";
		item[1] = "참치 선물팩";
		item[2] = "맥스봉 한팩";
		
		price[0] = 112500;
		price[1] = 25500;
		price[2] = 500;
		for(int i=0; i<item.length; i++) {
			System.out.println("품명: "+item[i]+"    가격:  "+price[i]);
		}
		
	}

}
