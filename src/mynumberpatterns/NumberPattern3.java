package mynumberpatterns;

/*
1 2 3 4 
1 2 3 
1 2 
1 
 */
public class NumberPattern3 {

	public static void main(String[] args) 
	{
		int rows=5;
		
		for(int i=rows;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
	}

}
