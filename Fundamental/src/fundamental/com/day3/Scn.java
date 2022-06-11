package fundamental.com.day3;

import java.util.Scanner;

public class Scn {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		String result = "Input: ";
		System.out.println(result);
		
		String mon = scan.nextLine(); //Input as String
		int mas = scan.nextInt(); //Input as Integer
		
		
			System.out.println("The input is: " + mon);

				
		System.out.println("The input is: " + mas);
		}	
}
