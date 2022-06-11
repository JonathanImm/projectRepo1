package learning.IO;

public class Input {
	
	public void lano(int a) {//Inside the parentheses of lano(), you can put parameters in it.
						 //This said process of putting parameter inside a Method's parentheses...
						 //...is called "Input" Method.
		
		int res = a + 3;
		System.out.println(res); //In Method Input, usually the Printing is done...
								 //...in the said Method, not in the Main Method.
		
	}
	
	
	public void tinn() {
		
		int a = 2;
		int res2 = a + 4;
		
		System.out.println(res2);
		
	}
	

	public static void main(String[] args) {
		
		Input result = new Input();
		result.tinn();	 
		
		
	}
	
}// End Bracket!!
