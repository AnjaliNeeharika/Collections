package MultiDimensionalArrays;

public class MultiClass1 {

	public static void main(String[] args) {
	    String r[][] = new String[2][4];
	    
	    r[1][3] = "One Three";
	    r[0][1] = "Zero One";
	    r[1][1] = "One One";
	    r[0][2] = "Zero Two";
	    r[1][2]= "One Two";
	    r[0][3] = "Zero Three";
	    r[1][0] = "One Zero";
	    r[0][0] = "Zero Zero";
	    
	    for(int q = 0; q<r.length ; q++)
	    {
	    	
	    	for (int s = 0; s<4; s++)
	    	{
	    		System.out.print(r[q][s] +"  ");
	    	}
	    	
	    	System.out.println();
	    }
	    
	    
	    

	}

}
