package learning.Polymorphism;

import java.util.ArrayList;

public class Overload {
	
	
	//plus v1
	public static int plus (int a, int b) {
		
		int result = a + b;
		return result;
		
	}
	
	
	//plus v2
	public static double plus (int a, double b) {
		
		double result = a + b;
		return result;
		
	}
	

	
	public static void main(String[] args) {
		
		System.out.println(plus(5,0.2));
		
		
	}

}
