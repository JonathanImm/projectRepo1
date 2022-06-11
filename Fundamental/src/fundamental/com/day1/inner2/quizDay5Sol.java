package fundamental.com.day1.inner2;

import java.util.Iterator;

public class quizDay5Sol {
	
	
public static void main(String[] args) {

// Quiz no. 2	
	
//	int loop = 20;
//	String text = "";
//	
//	
//	if (loop %2 == 0) {
//		//If the "if" condition is true, then this is even numbers
//		
//		if (loop > 10) 
//			text = "GENAP";
//		else
//			text = "genap";
//		
//	} else {
//		//Otherwise, this is odd numbers
//		
//		if (loop > 10) 
//			text = "GANJIL";
//		else
//			text = "ganjil";
//	}
//	
//	
//	
//	for (int i = 1; i <= loop; i++) {
//		
//			if (i % 5 == 0) 
//			System.out.println(i + " " + text + "!");
//			else
//			System.out.println(i + " " + text);
//		
//			}
	
	
//How to sum all the numbers inside an array.
	
	int daftar[] = {1000, 2500, 3100, 400};
	
	int total = 0; //set the total as 0.
	
	for (int i = 0; i < daftar.length; i++) {
		
		total += daftar[i]; //where the addition happen. "total" is keep getting summed.
		System.out.println("Harga sekarang: " + total);
	}
	
	System.out.println();
	System.out.println("Total semua: " + total);
	
	
	
	}
}
