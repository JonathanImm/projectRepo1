package fundamental.com.day4;

import java.util.ArrayList;

public class ArrayListHoho {

	public static void main(String[] args) {
		// Type 1
		
		ArrayList<String> menu = new ArrayList<>();
		menu.add("Ayam Geprek");
		menu.add("Ayam Bakar");
		menu.add("Sate Taichan");
		
		ArrayList<Integer> jum = new ArrayList<>();
		jum.add(3);
		jum.add(4);
		jum.add(3);
		
		System.out.println("List pesanan: ");
		
		for (int i = 0; i < menu.size(); i++) {
			System.out.println(menu.get(i) + " = " + jum.get(i));
			}
		
		System.out.println();
		
		menu.remove(2);
		jum.remove(2);
		
		System.out.println("List pesanan terakhir: ");
		
		for (int i = 0; i < menu.size(); i++) {
			System.out.println(menu.get(i) + " = " + jum.get(i));
			}
		
//		for (int i = 0; i < menu.size(); i++) {
//			System.out.println(menu.get(i) + " = " + (jum.get(i)-1));
//			}
		
		System.out.println();
		System.out.println();
		
				
//		Type 2
		ArrayList<String> manu = new ArrayList<>();
		
		manu.add("Ayam Geprek");
		manu.add("Ayam Geprek");
		manu.add("Ayam Geprek");
		manu.add("Ayam Bakar");
		manu.add("Ayam Bakar");
		manu.add("Ayam Bakar");
		manu.add("Ayam Bakar");
		manu.add("Sate Taichan");
		manu.add("Sate Taichan");
		manu.add("Sate Taichan");
		
		
		int del = 3;
		
		for (int i = 0; i < del; i++) {
			manu.remove(manu.size() - 1);
			}
		
		for (int i = 0; i < manu.size(); i++) {
			System.out.println(manu.get(i));
		}
		
	}

}
