package mynumberpatterns;

/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
 */
public class NumberPattern7 {

	public static void main(String[] args)
	{
		int rows=5;
		
		int value=1;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(value+" ");
				value++;
			}
			System.out.println();
		}
	}

}
