package java_1231;

public class Ex_c extends Ex_b {
	String a;
	
	@Override
	public String getA() {
		
		return super.a;
	}

	@Override
	public void setA(String a) {
		
		this.a = a+a;
	}

	@Override
	public String getB() {
		
		return b;
	}

	@Override
	public void setB(String b) {
		
		this.b = b+b;
	}
	
	
}
