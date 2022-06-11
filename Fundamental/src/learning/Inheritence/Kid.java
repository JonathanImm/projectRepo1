package learning.Inheritence;

public class Kid extends Orang {//Kid Class is an "extension" of the Orang Class.
	
	
//	public void nyan(){
//		
//		super.bakat(); //Summoning Method "bakat()" from Orang Class.
//		
//	}
	
	

	public static void main(String[] args) {
		
		//Kid Class have no other Methods, however it will rely on the "Parent" 's Methods
		//Summon it by using the "extends"
		
		System.out.println(boy);
		
		
		Kid an = new Kid();//Registering "an" as member of Kid() Class.
		
		
		an.bakat();
		an.emas();
		an.rumah();
		//These Methods of "bakat", "emas" and "rumah" has been declared in Orang Class.
		
		
		System.out.println();
		
		
		Orang un = new Orang(); //You can make normal registration and summon
		un.emas();
		//But this would be inefficient as this Class already inherit all...
		//...the Methods from the Orang Class.

	}

}
