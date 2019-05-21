package numberpatterns;

/*
 * 
 *   1 
     1 2 
     1 2 3 
     1 2 3 4 
     1 2 3 4 5 
 */

public class IncrementalLeftTriangleNumbers {

	public static void main(String[] args) 
	{
		int rows=5;
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=rows;j>=1;j--)
			{
				System.out.print(" ");
			}
				
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
