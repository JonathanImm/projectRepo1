package fundamental.com.day4;

import java.util.Scanner;

public class ArrayTraining {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] baju = {"Jaket", "Kaos", "Jeans", "Hoody"};
		int [] harga = {100000, 100000, 100000, 250000};
		int [] jumlah = new int [3];
		int total = 0;
	
		
		for (int i = 0; i < baju.length; i++) {
			if (harga[i] != 250000) {
				if (i < 3) 
					jumlah[i] = harga[i];
					System.out.println("Baju: " + baju[i] + ", Harga: "+ jumlah[i]);
					total += jumlah[i];
					//System.out.println("Total: " + total);
				}
			else
				System.out.println("Batas pembelian hanya 3.");
			}
		
		System.out.println("Total Harga yang dibayar: " + total);
		
		}
		
//		for (int i = 0; i < harga.length; i++) {
//			if (i == 3) 
//				System.out.println("Jenis baju " + baju[i] + ": " + harga[i]);
//			else
//				System.out.println("Jenis baju " + baju[i] + ": " + harga[i]);
//			
//		}
		
		
			
		
		

	}


