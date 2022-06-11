package fundamental.com.day1.inner2;

import java.util.Scanner;

public class quiz7 {

	public static void main(String[] args) {
		
		Scanner ini = new Scanner(System.in);
		Scanner ino = new Scanner(System.in);
				
		String satu = "Silahkan pilih menu dengan masukkan nomornya: ";
		String dua = "1. Masukkan/Ubah nama anda";
		String tiga = "2. Tampilkan nama anda";
		String mpat = "3. Keluar dari program";
		String lima = "Silahkan masukkan pilihan: ";
		
		
		String pilih = "";
		
		
		while (!pilih.equals("1")) {
			System.out.println(satu);
			System.out.println(dua);
			System.out.println(tiga);
			System.out.println(mpat);
			System.out.printf(lima);
			pilih = ini.next().toLowerCase();
			
			switch (pilih) {
			case "1":
				System.out.println();
				break;
			
			case "3":
				System.out.println("Terima kasih telah menggunakan program kami");
				System.out.println();
				break;
				
			case "2":
				System.out.println("Maaf, anda belum menginput nama, silahkan menginput nama terlebih dahulu.");
				System.out.println();
				continue;
				
			default:
				System.out.println("Maaf, pilihan menu tersebut tidak tersedia");
				System.out.println();
				continue;
			}
		}
	
		
		System.out.printf("Masukkan nama anda: ");	
		String nama = ino.nextLine();
		
		System.out.println("Terima kasih, nama anda sudah tersimpan sebagai: " + nama);
		
		
		while (!pilih.equals("2")) {
			System.out.println(satu);
			System.out.println(dua);
			System.out.println(tiga);
			System.out.println(mpat);
			System.out.printf(lima);
			pilih = ini.next().toLowerCase();
			
			switch (pilih) {
			case "1":
				System.out.println();
				break;
			
			case "3":
				System.out.println("Terima kasih telah menggunakan program kami");
				System.out.println();
				break;
				
			case "2":
				System.out.println("Maaf, anda belum menginput nama, silahkan menginput nama terlebih dahulu.");
				System.out.println();
				break;
				
			default:
				System.out.println("Maaf, pilihan menu tersebut tidak tersedia");
				System.out.println();
				break;
			}
		}
		
				
	}

}
