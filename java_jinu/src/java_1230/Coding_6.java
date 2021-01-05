package java_1230;

public class Coding_6 {

	public static void main(String[] args) {
		String str1= "9B768C";
		String str2[] = new String[6]; 
		int sum = 0;
		for(int i=0; i<str1.length(); i++) {
			str2[i] = str1.substring(i,i+1);
			try {
				sum += Integer.parseInt(str2[i]);
			}catch(NumberFormatException e){
				char c = str2[i].charAt(0);
				sum += c;
			}catch(Exception e) {
				char c = str2[i].charAt(0);
				sum += c;
			}
		}
		
		System.out.println(sum);
		

	}

}
