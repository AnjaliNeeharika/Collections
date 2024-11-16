package LinkedHashMapPack;


import java.util.LinkedHashMap;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		LinkedHashMap R = new LinkedHashMap();
		
		R.put(123, "one two three");
		R.put("A", "Value is A");
		R.put("A1", "Value is A");
		R.put("A", "A is the value");
		R.put(true, "The Statement is true");
		R.put("true", "The Statement is true");
		
		
		System.out.println(R);
		
		
	}

}
