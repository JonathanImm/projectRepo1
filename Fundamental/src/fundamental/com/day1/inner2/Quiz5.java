package fundamental.com.day1.inner2;

public class Quiz5 {

	public static void main(String[] args) {

//	Question no. 1
		
//		int hadiah = 0;
//		int juara = 1;
//		
//		if (juara == 1)
//			System.out.println("200000");
//		else if (juara == 2)
//			System.out.println("100000");
//		else if (juara == 3)
//			System.out.println("50000");
//		else
//			System.out.println("10000");
		
		
		
//	Question no. 2
		
		int l = 10;
		int o = 15;
		int p = 20;
		
		int gen = l;
		
		String odd = "ganjil";
		String even = "genap";
		
		switch (l) {
		case 10:
			for (int i = 1; i <= 10; i++) {
				if (i % 5 == 0) //Last time have a problem in this part
					//Last time the boolean expression in "if" is manual
					//(i == 4 ||i == 9)
					//With the "if" statement changed, the "for" expressions must also be edited
					System.out.println(even + "!");
				else
					System.out.println(even);
				}
			break;
		
		case 15:
			for (int j = 1; j <= 15; j++) {
				if (j % 5 == 0) //Last time have a problem in this part
					System.out.println(odd.toUpperCase() + "!");
				else
					System.out.println(odd.toUpperCase());
				}
			break;
			
		case 20:
			for (int k = 1; k <= 20; k++) {
				if (k % 5 == 0) //Last time have a problem in this part
					System.out.println(even.toUpperCase() + "!");
				else
					System.out.println(even.toUpperCase());
				}
			break;
	
			
		}
		
		
		

	}

}
