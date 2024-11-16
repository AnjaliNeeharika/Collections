package ArraysPack;

public class Arrays10 {

	public static void main(String[] args) {
		int a[] = new int[5];
		
		a[0] = 1;
		a[2] = 2;
		a[1]= 3;
		a[4] = 4;
		a[3] = 5;
		
		int sum=0;
		
		for(int i=0; i<a.length; i++)
		{
			
			sum = sum+a[i];
			
		}
		System.out.println(sum);
		
		
		

	}

}
