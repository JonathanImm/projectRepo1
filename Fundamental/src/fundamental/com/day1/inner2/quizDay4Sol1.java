package fundamental.com.day1.inner2;

public class quizDay4Sol1 {
	
//Loop no.2
//Result:
//	12 11 10
//	9 8 7 
//	6 5 4
//	3 2 1 
	
	public static void printDeretTurun(int jumlahBaris, int jumlahKolom) { //This is OOP
		
		int maxValue = jumlahBaris * jumlahKolom;
		
		for (int i = 0; i < jumlahBaris;i++) {
			for (int j = 0; j < jumlahKolom; j++) {
				System.out.printf("%3s", maxValue);//note that it use...
				//..."printf" or you can use "print".
				maxValue = maxValue - 1;
			}
			
			System.out.println();	
		}
		
	}
	
	public static void main(String[] args) {
				
				printDeretTurun (4,3);
		
		
	}

}
