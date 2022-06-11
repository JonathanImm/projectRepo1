package fundamental.com.day6.ExchangeHandling;

public class TryCatch { //Exception Handling.
	
	
	public static void main(String[] args) {
		
		
		int[] angka = {1, 3};
		int data = 5/0; //Technically this is error because any number divided by 0 is...
		//...infinity, and Java cannot define "infinity"
		// But Java have yet to recognize this is an error.
		// This is called "Unchecked Error".
		

		
		try {
			
			angka[2] = 9;
			int dat = 5/0;
			
			
		} catch (ArrayIndexOutOfBoundsException e) { //"catch()" have different parameters...
													 //...depending what you need.
		
			System.out.println("Error " + e.getMessage()); //If you want to see what's the...
														   //...error, you need the...
														   //"e.getMessage()" code
		

		} catch (ArithmeticException e) { // Just like the "else if" from "If" Condition, 
										  //..."catch()" can be use multiple time...
										  //....in one "try" Function.
		
			System.out.println("Error " + e.getMessage());
			
			
		} catch (Exception e) { //"Exception e" is the most common one
		
			System.out.println("Error " + e.getMessage());
			
			
		} finally { // The "finally" is a message that will always appeared...
					//...whenever there are error.
			
			System.out.println("Yes, there's error.");
			
		}
		
		
//Albeit there are 2 errors inside "try", when we run, the program will only play... 
//...the first error. This is because the moment Java found an Error inside "Try"...
//...it will immediately jump into "catch", ignoring the other Errors below it.
		
//In order the "TryCatch" to run all the Errors at once, you need to use...
//...the NestedTry technique.
			
		
	
		for (int i = 0; i < 5; i++) {
			
			System.out.println("my loop " + i);
			
		}
		
		
	} //End Bracket Main Method!!

	
}//End Bracket!
