package java_0104;

import java.util.ArrayList;

public class ArrayList_ex {

	public static void main(String[] args) {
		ArrayList<QWE> a = new ArrayList<QWE>();
		a.add(new QWE());
		a.add(new QWE("김진우1"));
		a.add(new QWE("김진우2"));
		a.add(new QWE("김진우3"));
		a.add(new QWE("김진우4"));
		for(QWE s : a) {
			s.showInfo();
		}
	}

}

class QWE{
	String name;
	
	QWE(){
		
	}
	
	QWE(String s){
		name = s;
	}
	
	public void showInfo() {
		System.out.println(name);
	}
}
