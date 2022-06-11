package learning.Construct;

public class Shirt {
	
	
	//Properties
	
	static public String color;
	static protected char size;
	
	
	
	//The Shirt() Class is now being declared with functions
	//Treat the Constructor's syntax as how you would Methods 
	Shirt(String chooseColor, char chooseSize){
		color = chooseColor;
		size = chooseSize;
	}
	//The code is revamped into "chooseColor" and "chooseSize" to better differentiate
		
	
	
	//What it can do
	
	//Put on and off
	public static void putOn() {
		System.out.println("Shirt is on!");
	}
	
	public static void takeOff() {
		System.out.println("Shirt is off!");
	}
	
	
	//Set new color and size
	public static void setColor(String newColor) {
		color = newColor;
	}
	
	public static void setSize(char newSize) {
		size = newSize;
	}
	
	

}
