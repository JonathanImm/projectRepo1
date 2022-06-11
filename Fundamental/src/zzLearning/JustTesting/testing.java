package zzLearning.JustTesting;

import java.util.ArrayList;

public class testing {
	
	public static void main(String[] args) {
		
		//Array 2D
		
//		String[][] data = new String[3][2]; //The first Capital Bracket refer to Row, the 2nd refer to Column 
//		
//		data[0][0] = "no 0 and 0";
//		data[0][1] = "no 0 and 1";
//		
//		data[1][0] = "no 1 and 0";
//		//data[1][1] = "no 1 and 1";
//		
//		data[2][0] = "no 2 and 0";
//		data[2][1] = "no 2 and 1";
//		
//		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 2; j++) {
//				
//				System.out.print(data[i][j] + " | ");
//				
//			}	
//		System.out.println();
//		}
		
		
		
		
//		String[] data = new String[3];// 
//		
//		data[0] = "no 0";//
//		data[1] = "no 1";
//		data[2] = "no 2";
//		
//		
//		for (int i = 0; i < data.length; i++) {
//			System.out.println(data[i]);
//		}
		
		

		
//	Array List
		ArrayList<String> sayur = new ArrayList<>();
		
		sayur.add("Broko");
		sayur.add("Bay");
		sayur.add("Kang");
		
		
		for (int i = 0; i < sayur.size(); i++) {
			
		System.out.println("Index ke " + i + " " + sayur.get(i));
		
		}
		
		
		System.out.println();
		
		sayur.remove(1); //Removing one of the value
		
		
		for (int i = 0; i < sayur.size(); i++) {
			
			System.out.println("Index ke " + i + " " + sayur.get(i));
			
		}
		
		
		
	} //End curly brackets. Don't touch

}
