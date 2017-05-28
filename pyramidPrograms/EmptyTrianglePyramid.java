package pyramidPrograms;

import java.util.Scanner;

public class EmptyTrianglePyramid {

	private static int rowNum;
	
	public static void createPyramid(){
		
		System.out.print("Enter your #rows");
		
		Scanner inv = new Scanner(System.in);
		
		rowNum = inv.nextInt();
		
		System.out.println("*");
		
		for(int i = 1; i <= rowNum; i++){
			
			System.out.print("*");
			
			for(int j = 1; j < i; j++)
			{
				System.out.print(" ");
			}
			
			System.out.println("*");
		}
		
		for(int j = 1; j<= rowNum + 2; j++)
		{
			System.out.print("*");
		}
	}
}
