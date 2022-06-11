package fundamental.com.day6;

import java.util.ArrayList;
import java.util.Iterator;

public class InputOutput {
	
//	public static void inp(int a, int b, int c) {
//		
//		int res = (a*a);
//		int sul = (b*b); 
//		int lt = (c*c);
//		
//
//		System.out.println(res + ", " + sul + ", " + lt);
//
//	}
	
	
	//Run Method
	public static void main(String[] args) {
		
		inp(2, 3 ,7, 1);
		
	}

	
	public static void inp(int a, int b, int c, int d) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		result.add(a);
		result.add(b);
		result.add(c);
		result.add(d);
		
		
		for (Integer item : result) {//Special "For" Iteration designed for Arrays.
									 //It means iterate as much as the size() or... 
			 						 //...length of the ArrayList/Array
									 		
			item *= item;
			System.out.println(item + ", ");
			
		}
		

	}
	
	
	
	
}//End Bracket
