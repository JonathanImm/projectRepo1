package fundamental.com.day1.inner2;

import java.util.ArrayList;

public class quizDay6Sol {

	public static void main(String[] args) {
// Solution Quiz no.2
		// 1 x 3 x 5 x 7 x 9 x
		
		int b = 5;
				
		for (int i = 1; i <= b; i++) {
			
			if (i%2 == 1) 
				System.out.print(i);
			else
				System.out.print(" x ");
							
		}
		
		//Using this method then the "x" will be consider to be a part of the int "b" sequence.
		//But what we want is the "x" is not part of the int "b" sequence.
		//Therefore the result is: "1 x 3 x 5"
		
		
		System.out.println();
		
		
		int n = 5;
		int size = 1;
		
		for (int i = 0; i < n; i++) {
			
			System.out.printf("%3s", size + " x ");// Print "1 x", and so on.
			size += 2; // Manually add the other odd numbers instead using iteration.
			
		}
		
		//This is using "tumbal", which in this case the variable "size".
		//The solution is actually very simple. So perhaps next time, before we go...
		//...the hard way, try to do the basic/cheap way first.
				
		
				
				
// Solution Quiz no. 3
		// 2 4 4 4 6 6 6 6 6
		
//		int ukuran = 9;
//		int odd = 1;
//		int even = 2;
//		
//		int[] deret = new int[ukuran]; //utk menyimpan deret ganjil
//		int[] deretodd = new int[ukuran];
//		int[] dereteven = new int[ukuran];
//		
//		int ndx = 0;
//		int brs = 0;
//		
//		for (int i = 0; i < dereteven.length; i++) {
//			deretodd[i] = odd;
//			odd += 2;
//			
//			dereteven[i] = even;
//			even +=2;
//			
//			if (ndx < ukuran) {
//				for (int j = 0; j < deretodd[i]; j++) {
//					brs = dereteven[i];
//					deret[ndx] = brs;
//					ndx ++;
//				}
//				
//			}
//			
//		}
//		for (int k = 0; k < deret.length; k++) {
//			System.out.printf("%3s", deret[k]);
//		}
		
		
		
// Solution Quiz no. 4
		
//		int b = 2;
//		int c = 1;
//		String opera = "-";
//		
//		ArrayList<Double> a = new ArrayList<Double>();
//		a.add(5.80);
//		a.add(5.20);
//		a.add(3.99);
//		
//		if (opera.equals("+")) {
//			double result = a.get(b) + a.get(c);
//			System.out.println(a.get(b) + " + " + a.get(c) + " = " + result);
//		}
//		else if (opera.equals("-")) {
//			double result = a.get(b) - a.get(c);
//			System.out.println(a.get(b) + " - " + a.get(c) + " = " + result);
//		}
//			
		
	}

}
