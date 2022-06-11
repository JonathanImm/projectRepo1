package learning.PenOOP;

public class PenAction {
	
	
//Now we can actually use the pen we created back at PenPrep Class!
//"public static main" is the Method where the program will be ran.
	
	public static void main(String[] args) {
	
		//Registering variable to class, AKA Instance
		PenPrep p = new PenPrep();
		
		
		//Printing the properties values of the PenPrep.
		System.out.println(p.color);//printing the color's value
		System.out.println(p.type);//printing the type's value
		System.out.println(p.point);//printing the point's value
		
		
		System.out.println();
		
		
		//Printing the Functions. Click or Unclick
		System.out.println(p.clicked);
			
		p.click();
		
		System.out.println(p.clicked);
		
		p.unclick();
		
		System.out.println(p.clicked);
		

	}//End Bracket!!

}
