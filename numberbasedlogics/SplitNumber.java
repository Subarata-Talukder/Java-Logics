/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalogics.numberbasedlogics;

import java.util.Scanner;

/**
 *
 * @author student Java program to split number into digits.
 */
public class SplitNumber {

    public static void main(String[] args) {

        int temp, num, factor = 1;

        Scanner scanner = new Scanner(System.in);
        System.err.println("Enter your number");
        num = scanner.nextInt();
        temp = num;
        while (temp != 0) {
            temp = temp / 10;
            factor = factor * 10;
        }

        System.out.println("Each digits of given number are: ");

        while (factor > 1) {
            factor = factor / 10;
            System.out.print((num / factor) + " ");
            num = num % factor;
        }
        System.out.println(" ");  
    }
}
