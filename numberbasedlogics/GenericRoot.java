/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalogics.numberbasedlogics;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class GenericRoot {

    // Do sum of digits of a number until we don't get a single digit.
    public static void main(String[] args) {

        System.out.println("Enter a number");
        int sum = 0;
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        
        if (number < 10) {
            System.out.println("Please enter at least 2 digit number");
        } else {

            while (number > 10) {

                sum = 0;

                while (number != 0) {
                    int digit = number % 10;
                    number = number / 10;

                    sum += digit;
                }

                if (sum > 10) {
                    number = sum;
                } else {
                    break;
                }
            }
            System.out.println("Sum of the digits in single digit is: " + sum);
        }
    }
}
