package LinkedHashMapPack;


import java.util.LinkedHashMap;

public class LinkedHashMap2 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> R = new LinkedHashMap();
		
		R.put(123, "one two three");
		R.put(4635, "Value is A");
		R.put(352424, "Value is A");
		R.put(99764, "A is the value");
		R.put(252525, "The Statement is true");
		R.put(4635, "The Statement is true");
		
		
		System.out.println(R);
		
		
	}

}
