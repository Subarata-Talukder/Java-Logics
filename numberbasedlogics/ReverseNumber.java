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
public class ReverseNumber {

    public static void main(String[] args) {

        int reverse = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for Reverse");

        int num = scanner.nextInt();

        while (num != 0) {

            int reveredNumber = num % 10;
            reverse = reverse * 10 + reveredNumber;
            num = num / 10;
        }
        System.out.println("Reverse Numbers are " + reverse);
    }
}
