package learning.Generic;

public class Main {

	public static void main(String[] args) {
		
		Printers<Integer> p = new Printers<>(24);		
		p.print();
		
		Printers<Double> b = new Printers<>(22.5);		
		b.print();
		
		Printers<String> o = new Printers<>("Something");		
		o.print();
	
		
	}

}
