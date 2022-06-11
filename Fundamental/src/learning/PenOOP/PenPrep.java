package learning.PenOOP;

public class PenPrep {
//Suppose I have a pen.
//Blue pen, a type gel and it's 10mm size.
//Represent it in Java
	
	//The pen's properties
	
	String type = "gel";
	String color = "blue";
	int point = 10;
	
	
//The pen's function! It can be click and unclick.

	//The pen's click function
	
	static boolean clicked = false;
	
	
	public static void click() {
		clicked = true;
	}
	
	public static void unclick() {
		clicked = false;
	}
	


}//End Bracket!!
