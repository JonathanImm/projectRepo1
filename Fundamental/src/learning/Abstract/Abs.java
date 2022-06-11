package learning.Abstract;


interface Doggo{ //Interface
	
	void bark();
	abstract void doodoo();
	
	
}



abstract class Dog{ //Set the Abstract Class
	
	public void bark() { //Normal Method
	
		System.out.println("Woof!");
		
	}
	
	public abstract void doodoo(); //The Abstract Method
	
}


class Golden extends Dog{ //Class 2
	
	public void doodoo() { //Setting what the parent's Abstract Method do.
		
		System.out.println("He's got doodoo!!");
		
	}
	
}


public class Abs { //Main Class
	
	public static void main(String[] args) {
		
		Golden d = new Golden();
		
		d.bark();
		d.doodoo();
		
	}

}
