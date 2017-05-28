package javalogics.numberbasedlogics;

import java.util.Scanner;

/**
 *
 * @author student Perfect Number: a perfect number is a positive integer that
 * is equal to the sum of its proper positive divisors, that is, the sum of its
 * positive divisors excluding the number itself. Example : 6 has divisors 1,2,3
 * so 6 = 1+2+3
 */
public class PerfectNumber {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int testNumber, i = 1, sum = 0;

        System.out.println("Enter a number");
        testNumber = userInput.nextInt();

        while (i < testNumber) {
            if (testNumber % i == 0) {
                sum = sum + i;
            }
            i++;
        }

        if (sum == testNumber) {
            System.out.println(i + " is a perfect number");
        } else {
            System.out.println(i + " is not a perfect number");
        }
    }
}
