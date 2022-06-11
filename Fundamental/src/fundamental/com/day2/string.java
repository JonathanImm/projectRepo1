package fundamental.com.day2;

public class string {

	public static void main(String[] args) {

		// The " " technique. This is learn AFTER the 2nd day's test.
		// So it's a new knowledge.
		String nama = "Rob";
		int nom = 11;

		// String result = nama + " " + nom + " " + nama;
		// System.out.println(result);
		System.out.println(nama + " " + nom + " " + nama);
		

		// While Condition
		int i = 0;
		int itera = 3;

		while (i < 5) {
			System.out.println("Spin = " + itera);
			itera += itera;
			i++;
		}

	}

}
