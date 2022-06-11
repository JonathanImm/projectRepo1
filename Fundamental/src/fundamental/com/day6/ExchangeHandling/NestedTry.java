package fundamental.com.day6.ExchangeHandling;

public class NestedTry {
	
	
	try {
		
		try {
			
			int data = 5/0;
			
		} catch(ArithmeticException e) {
			
			System.out.println("Error " + e.getMessage());
			
		}
		
		try {
			
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
	}

}
