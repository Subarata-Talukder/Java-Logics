package pyramidPrograms;

import java.util.Scanner;

public class StarTriangleFramePyramid {

	private static int rowNum, n;

	public static void framePyramid() {
		System.out.println("Enter the row number");

		Scanner inv = new Scanner(System.in);

		n = rowNum = inv.nextInt();

		for (int i = 1; i <= rowNum; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(" ");
			}

			for (int k = 1; k <= n; k++) {

				System.out.print("*");
			}

			for (int k = 1; k <= n; k++) {

				System.out.print("*");
			}

			n--;

			System.out.println();
		}

		for (int i = 2; i <= rowNum; i++) {

			for (int j = rowNum - i + 1; j >= 1; j--) {

				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {

				System.out.print("*");
			}

			for (int c = i - 1; c >= 1; c--) {
				
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
