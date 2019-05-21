package numberpatterns;

/*
 *  1 
   2 1 
  3 2 1 
 4 3 2 1 
5 4 3 2 1 
 */
import java.util.Scanner;

public class DecrementalNumbersPyramid {

	public static void main(String[] args) 
	{
        System.out.println("** Printing the pattern... **");

        int rows=5;
        for (int i = 1; i <= rows;i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--)
            {
                System.out.print(k+ " ");
            }
            System.out.println();
        }
	}
}
