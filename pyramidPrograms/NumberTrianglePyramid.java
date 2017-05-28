package pyramidPrograms;

import java.util.Scanner;

public class NumberTrianglePyramid {
	
	private static int num;
	
	public static void drawPyramid()
	{
		System.out.println("Enter loop repeat number(rows):");
		Scanner in = new Scanner(System.in);
		
		num = in.nextInt();
		
		for(int i = 1; i <= num; i++){
			
			for(int j = 1; j <= num - i; j++)
			{
				System.out.print(" ");
			}
			
			for(int k = 1; k <= 2 * i - 1; k++)
			{
				System.out.print(" " + k); // If you put i replace of k, check the result
			}
			
			System.out.println();
		}	
	}
}
