package fundamental.com.day1.inner2;

import java.util.Scanner;

public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		String done = "cukup";
		
		int u = 10000;
		
		System.out.println("Jumlah uang: " + u);
		System.out.println("Jumlah \"cukup\" untuk berhenti, ketik apapun untuk lanjut");
		
		while (sn.hasNext()) {
			u*=2;
			System.out.println("Jumlah uang: " + u);
			System.out.println("Jumlah \"cukup\" untuk berhenti, ketik apapun untuk lanjut");
			
			String inp = sn.nextLine();
			
			
			if (inp.equals(done)) { 
				System.out.println("Program penggandaan selesai.");
				sn.close();
				break;
			}
		
		}
		
		
		
	}

}
