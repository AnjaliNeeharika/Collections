package ArrayListPack;

import java.util.ArrayList;

public class ArrayList5 {

	public static void main(String[] args) {
		ArrayList A = new ArrayList();
		
		A.add("Hai");    //0
		A.add("Good");   //1
		A.add(false);    //2
		A.add(1234);     //3
		A.add('&');     //4
		A.add(34.6F);    //5
		A.add(true);     //6
		A.add(false);    //7
		A.add(67L);     //8
		
		System.out.println(A);
		
		
	System.out.println("The Total elements stored in A are :  "+A.size());	
	
	
	ArrayList B = new ArrayList();
	
	B.add(45);
	B.add("TRUE");
	B.add(763252);
	B.add(false);
	B.add("Age");
	B.add(64143L);
	
	System.out.println(B);
	
	System.out.println("The Total elements stored in B are :  "+B.size());	
	
	
	B.addAll(A);
	
	System.out.println(B);
	
	
		
		
		
	
		
		
		
		

	}

}
