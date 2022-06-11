package learning.Generic;

public class Printers<T> { //Adding "<>" to define the Printers Class to be Generic.

//You can give whatever name you want for the variable.
//We're using the "T" because that is the most common used variable for Generics.
	
	
	T thing; //instead of using integer, float or any variable types, we're using the "T".
			 //Right now as we're coding the Class, we don't know what type of things...
			 //...this Printers is going to be asked to print.
	//But with this "T", it will gives the ability to create...
	//...Printers Class for any type you want
	
	
	public Printers(T inp) {
		
		thing = inp;
		
	}
	
	
	public void print() {
		
		System.out.println(thing);
		
	}

}
