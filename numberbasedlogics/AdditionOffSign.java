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
public class AdditionOffSign {

    public static void main(String[] args) {

        System.out.println("Enter 1st number to add");
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        System.out.println("Enter 1st number to add");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber - ~secondNumber - 1; // Right shift + Back slash

        System.out.println("The sum is " + sum);
    }
}
