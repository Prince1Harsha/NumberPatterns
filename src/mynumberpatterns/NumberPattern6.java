package mynumberpatterns;

/*
1 1 1 1 1 
2 2 2 2 
3 3 3 
4 4 
5 
 */
public class NumberPattern6 {

	public static void main(String[] args) 
	{
		int rows=5;
		for(int i=1;i<=rows;i++)
		{
			for(int j=rows;j>=i;j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
