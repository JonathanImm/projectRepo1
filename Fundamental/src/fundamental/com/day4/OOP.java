package fundamental.com.day4;

public class OOP {
	
	public void penambahan() {

		int a = 5;
		int b = 2;
		
		int res = a + b;
		System.out.println(res);
		
	}
	
	
	public void pengurangan() {
	
		int a = 5;
		int b = 2;
		
		int res = a - b;
		System.out.println(res);
				
		secret();
		how();

	}
	
	
	private void secret() {
		
		System.out.println("It's a Secret.");
	
	}
	
	
	public static void how() {
		
		System.out.println("Howl's man");
				
	}

	
	
	public static void main(String[] args) {
		// method main(String) is for run/debug the program
		
		//Every time we register a variable as a Class' member, that is called "Instance".
		OOP azs = new OOP();
		azs.secret();
		
		System.out.println(azs);		

	}

}
