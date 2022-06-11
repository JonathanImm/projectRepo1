package learning;


class Append{
	
	public void boss() {
		System.out.println("La Boss");
	}
	
	public void bear() {
		System.out.println("DougDoug");
	}
	
}



public class Instance {

	public static void main(String[] args) {
		
		//Instance Shortcut
		new Append().boss();
		new Append().bear();
		
		
		//Normal Instance
		Append la = new Append();
		la.boss();
		la.bear();
		

	}

}
