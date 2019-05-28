package mynumberpatterns;

public class Test2 {

	public static void main(String[] args) 
	{
		int rows=5;
		
		for(int i=1;i<=rows;i++)
		{
			int temp=1;
			for(int j=rows;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=rows;j>=i;j--)
			{
				System.out.print(temp+" ");
			}
			
			System.out.println();
		}
	}

}
