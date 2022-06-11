package fundamental.com.day1.inner2;

import java.util.Scanner;
import java.util.Random;

public class quizDay4Sol2 {

	public static void main(String[] args) {
		
//Quiz no. 1		
		
		System.out.println("==============================");
		System.out.println("Money Multiplication Program");
		System.out.println("==============================");
		
		Scanner ipt = new Scanner(System.in);
		
		int uang = 10_000;
		String input = "";
		
		
		do {
			System.out.println("Jumlah uang anda sekarang: " + uang);
			System.out.println("Ketik \"cukup\" untuk berhenti ketik apapun untuk menggandakan");
			System.out.println();
			
			input = ipt.nextLine().toLowerCase();
			
			uang *= 2;
			
		} while (!input.toLowerCase().equals("cukup")); //When input is NOT "cukup", the loop continues.
		
		System.out.println("Program selesai.");
			
			
			
		
		
		
// Quiz no. 4		
		
//		Scanner in = new Scanner(System.in); //Variable "in" is registered as Scanner() Class as the input.
//		Random rand = new Random(); //Variable "rand" is registered to "Random()" Class.
//		
//		
//		System.out.println("==============================");
//		System.out.println("Random Program");
//		System.out.println("==============================");
//		
//		
//		System.out.println();
//		
//		System.out.print("Jumlah Baris  : ");
//		int baris = Integer.parseInt(in.nextLine()); //integer "baris" = with the power of Class Integer, 
//													 //convert into integer "in.nextLine()" that is String
//		System.out.println();
//		
//		System.out.print("Jumlah Kolom  : ");
//		int kolom = Integer.parseInt(in.nextLine());
//		
//		System.out.println();
//		
//		System.out.print("Nilai Maksimal  : ");
//		int maxScore = Integer.parseInt(in.nextLine());
//		
//		System.out.println();
//		
//		
//		System.out.println("==============================");
//		System.out.println("Terima kasih telah mengisi data");
//		System.out.println("Program akan membuat angka random sesuai jumlah nilai max.");
//		System.out.println("==============================");
//		
//		System.out.println();
//		
//		
//		
//		for (int i = 0; i < baris; i++) {
//			
//			for (int j = 0; j < kolom; j++) {
//				
//				int score = rand.nextInt(maxScore) + 1;
//				System.out.print(score + " ");
//				
//			}
//			System.out.println();
//		}
		
		
		
	}

}


