package javalogics.numberbasedlogics;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class PrintPerfectNumbers {

    public static void main(String[] args) {
        int i, sum = 0;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter number limit");
        int numberLimit = userInput.nextInt();

        System.out.println("Perfect numbers of " + numberLimit);

        for (int n = 1; n <= numberLimit; n++) {

            i = 1;
            sum = 0;
            
            while (i < n) {
                if (n % i == 0) {
                    sum = sum + i;
                }

                i++;
            }

            if (sum == n) {
                System.out.print(n + " ");
            }
        }
        
        System.out.println("");
    }
}
