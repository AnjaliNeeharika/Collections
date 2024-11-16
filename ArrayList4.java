package ArrayListPack;

import java.util.ArrayList;

public class ArrayList4 {

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
		
		
	System.out.println("The Total elements stored are :  "+A.size());	
	
	for(int d =0; d<A.size() ; d++)
	{
       System.out.println(A.get(d));	
	}
	
		
		
		
	
		
		
		
		

	}

}
