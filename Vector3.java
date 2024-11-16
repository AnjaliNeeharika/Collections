package VectorPack;

import java.util.Vector;

public class Vector3 {

	public static void main(String[] args) {
		Vector V = new Vector(6);
		
		V.add("abc");
		V.add("Hai");
		V.add(true);
		V.add(true);
		V.add(69);
		
		System.out.println("The Capacity is : " +V.capacity());
		
		V.add(true);
		V.add(69);
		
		System.out.println("The Capacity with 6+ is : " +V.capacity());
		

	}

}
