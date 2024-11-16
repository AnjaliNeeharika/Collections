package LinkedHashSetPack;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet H = new LinkedHashSet();
		
		H.add("Hai");
		H.add(1234);
		H.add("hai");
		H.add("Morning");
		H.add(false);
		H.add(false);
		H.add(36241);
		H.add('%');
		H.add(26352L);
		H.add("Hai");
		H.add("data");
		
		System.out.println(H);

	}

}
