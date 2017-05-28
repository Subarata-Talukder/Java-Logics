package pyramidPrograms;

import java.util.Scanner;

public class NumberTrianglePyramid01 {

	private static int rowNum;

	public static void drawPyramid01() {
		System.out.print("Enter row number to draw Pyramid");

		Scanner in = new Scanner(System.in);

		rowNum = in.nextInt();

		for (int i = 1; i <= rowNum; i++) {

			for (int j = rowNum - i; j > 0; j--) {

				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(i);
			}

			for (int l = 2; l <= i; l++) {
				System.out.print(i);
			}
			
			System.out.println();
		}
	}

}
