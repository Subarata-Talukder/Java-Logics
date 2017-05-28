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
public class SumOfDigits {

    public static void main(String[] args) {

        int sum = 0;

        System.out.println("Please enter a number");

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        while (number != 0) {

            int reversedNumer = number % 10;
            number = number / 10;

            sum += reversedNumer;
        }

        System.out.println("The sum of the number is " + sum);
    }

}
