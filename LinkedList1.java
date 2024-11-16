package LinkedListPack;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList L = new LinkedList();
		
		L.add("etewtew");
		L.add(24214124);
		L.add(true);
		L.add(true);
		L.add('%');
		L.add("Good night");
		System.out.println(L);
		
		L.addFirst("Adding First");
		L.addLast("Adding Last");
		
		System.out.println(L);
		
		L.removeFirst();
		L.removeLast();
		
		System.out.println(L);
		

	}

}
