package coding_10;

import java.util.Scanner;

public class Passward{
	
	String passward1 = "a12345";
	
	public Passward() {
		
	}
	
	public boolean passward_check(String passward) {
		
	if(passward1.equals(passward)) {
		return false;
	} else {
		return true;
	}
	}


}
