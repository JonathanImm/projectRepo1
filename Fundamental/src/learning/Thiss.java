package learning;

public class Thiss {
	
	String food;
	char size;
	
	public void set(String food, char size) { //"this" keyword can only be used...
											  //...Non-Static Method.
				
		this.food = food; 
		this.size = size; 
				
	}
	
	
	
	public static void main(String[] args) {
		
		Thiss result = new Thiss();
		
		result.set("Soup", 'L');
		
		
		System.out.println(result.food);
		System.out.println(result.size);
		
	}

}
