package numberpatterns;


/* Pattern to Print 1s in form of pyramid 
 * 
 * 	    1 
  	  1 1 
 	 1 1 1 
   1 1 1 1 
 * 
 * */
public class PyramidOfOnes {

	public static void main(String[] args) 
	{
		int rows=5;
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=rows;j>i;j--)
			{
				System.out.print(" ");
			}
			
			int temp=1;
			for(int k=1;k<i;k++)
			{
				System.out.print(temp+" ");
				//System.out.print(k+" ");
				
			}
			
			System.out.println();
		}
	}

}
