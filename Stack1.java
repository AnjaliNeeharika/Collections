package StackPack;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack S = new Stack();
		
		S.push(true);
		S.push(1234);
		S.push("good");
		S.push(56.7F);

		
		System.out.println(S);
		
		S.pop();  //removes 56.7
		
		System.out.println(S);
		
		
	System.out.println(S.firstElement());	
	System.out.println(S.lastElement());
	System.out.println(S.peek());	
		
		
		

	}

}
