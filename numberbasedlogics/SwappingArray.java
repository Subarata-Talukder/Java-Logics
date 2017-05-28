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
public class SwappingArray {

    public static void main(String[] args) {

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        System.out.println("Fill your frist Array ");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
            System.out.println(" next value " + i);
        }
        
        System.out.println("Fill your second Array ");
        for (int i = 0; i < 10; i++) {
            b[i] = scanner.nextInt();
            System.out.println(" next value " + i);
        }

        System.out.println("Before swaped of first Array");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("Before swaped of second Array");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        for (int i = 0; i < 10; i++) {

            c[i] = a[i];
            a[i] = b[i];
            b[i] = c[i];
        }

        System.out.println("After swaped of first Array");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("After swaped of second Array");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        
        System.out.println("");
    }
}
