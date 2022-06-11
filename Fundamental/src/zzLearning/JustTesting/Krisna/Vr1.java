package zzLearning.JustTesting.Krisna;

public class Vr1 {
	
	
	public static void Student(){
		
		String nama = "Krisna";
		String nim = "14.125.781.101";
		
		int mat = 70;
		int bi = 60;
		int pbo = 65;
		
		int rata = (mat + bi + pbo)/3;
		
		System.out.println("Nama " + nama);
		System.out.println("NPM/NIM " + nim);
		System.out.println("Nilai Matematika " + mat);
		System.out.println("Nilai Bahasa Indonesia " + bi);
		System.out.println("Nilai PBO " + pbo);
		System.out.println();
		System.out.println("Nilai rata-rata " + rata);
				
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vr1 result = new Vr1();
		result.Student();

	}

}
