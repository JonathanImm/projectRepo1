package fundamental.com.day3;

public class Pembeli {

	public static void main(String[] args) {
		
		int harga = 100_000;
						
			System.out.println("Beli hari ke 1: " + harga);
		
		
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j < i; j++) {
				harga = harga + 10_000;
				System.out.println("+ tips = " + " " + harga);
			}
			
		}

		
	}

}
