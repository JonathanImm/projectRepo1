package fundamental.com.day2;

public class GlobeandLoc {
	
	//global
	int me = 50;
	
	public void method1() { //Local
		
		int me = 10;
		int yu = 2;
		
		int result = this.me;
		
		System.out.println(me + yu + result);
		
	}

}
