package mynumberpatterns;

/*
5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1
 */

public class NumberPattern4 {

	public static void main(String[] args) 
	{
		int rows=5;
		
		for(int i=rows;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
