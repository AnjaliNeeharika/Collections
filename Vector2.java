package VectorPack;

import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
		Vector V = new Vector();
		
		V.add("abc");
		V.add("Hai");
		V.add(true);
		V.add(true);
		V.add(69);
		V.add(3646);
		V.add('&');
		V.add(2364623);
		V.add("Data");
		V.add(2364623);
		
		System.out.println("The Memory Capacity with 10 elements :  "+V.capacity());
		
		V.add(false);
		
		System.out.println("The Memory Capacity with 10+ elements :  "+V.capacity());
		
		V.add("abc");
		V.add("Hai");
		V.add(true);
		V.add(true);
		V.add(69);
		V.add(3646);
		V.add('&');
		V.add(2364623);
		V.add("Data");
		V.add(2364623);
		
		System.out.println("The Memory Capacity with 21+ elements :  "+V.capacity());
		
		
		

	}

}
