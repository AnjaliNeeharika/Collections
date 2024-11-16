package HashMapPack;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap R = new HashMap();
		
		R.put(123, "one two three");
		R.put("A", "Value is A");
		R.put("A1", "Value is A");
		R.put("A", "A is the value");
		R.put(true, "The Statement is true");
		R.put("true", "The Statement is true");
		
		
		System.out.println(R);
		
		
	}

}
