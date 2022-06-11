package learning.Polymorphism;


//We can make the Class Birb and Class Robin on different page, but we put...
//...them here just to make learning easier.

class Birb {
	
	public void sing() {
		System.out.println("Tweeter Tweet Tweety");
	}
	
	
}



class Robin extends Birb {
	
	@Override  //This is the Annotation that tells that this is...
			   //...the Overriding Polymorphism Method
	public void sing() { //The Method sing() here is written exactly the...
						 //...same as its Parent Class Birb(). Otherwise, it'll error.
		
		System.out.println("Time to tip the Scale!");
	} 	
	
}



public class Poly {
	
	
	public static void main(String[] args) {
				
		Robin wow = new Robin();
		wow.sing();
		
	}
	

}//End Bracket!!
