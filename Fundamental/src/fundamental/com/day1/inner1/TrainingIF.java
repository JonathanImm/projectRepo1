package fundamental.com.day1.inner1;

import java.util.Scanner;

public class TrainingIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		
		// nama Artis
		String nama = "Artis: ";
		System.out.println(nama);

		String inp1 = sc.nextLine();

		// poin act
		String act = "Poin Acting: ";
		System.out.println(act);

		int inp2 = sc.nextInt();

		// poin gimmick
		String gim = "Poin Gimmick: ";
		System.out.println(gim);

		int inp3 = sc.nextInt();

		// poin drama
		String drm = "Poin Drama: ";
		System.out.println(drm);

		int inp4 = sc.nextInt();

		// poin character
		String chr = "Poin Character: ";
		System.out.println(chr);

		int inp5 = sc.nextInt();
		
		
		//Average
		int average = (inp2 + inp3 + inp4 + inp5)/4;
		
		
		//The If Factor.
		if (average > 8){
			System.out.println(inp1 + " " + "Dapat Piala");}
		else {
				System.out.println(inp1 + " " + "Tidak Dapat Piala");
			}
		}

	}


