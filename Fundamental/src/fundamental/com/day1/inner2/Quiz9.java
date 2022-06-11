package fundamental.com.day1.inner2;

public class Quiz9 {

	public static void main(String[] args) {
		// Array 1
		
		int[] array = {9, 5, 6, 10, 80};
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		System.out.println(sum);
		
		
		System.out.println();
		System.out.println();
		
		
		String[] him = new String[3];
		
		him[0] = "811";
		him[1] = "433";
		him[2] = "375";
		
		int ver1 = Integer.parseInt(him[2]); //Convert String value of "him[2] into integer
		float ver2 = Float.parseFloat(him[2]); //Convert String value of "him[2] into float
		double ver3 = Double.parseDouble(him[2]); //Convert String value of "him[2] into double
		
		System.out.println("Bilangan type integer: " + ver1);
		System.out.println("Bilangan type float: " + ver2);
		System.out.println("Bilangan type double: " + ver3);
		
		System.out.println();
		
		int res1 = ver1 + ver1;
		System.out.println(res1);
		
		float res2 = ver2 * ver2;
		System.out.println(res2);
		
		double res3 = ver3 + ver3;
		System.out.println(res3);
		

	}

}
