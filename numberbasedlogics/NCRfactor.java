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
public class NCRfactor {

    public static void main(String[] args) {
        int n, r, ncr;
        Scanner s = new Scanner(System.in);
        System.err.println("Enter First number");
        n = s.nextInt();
        System.err.println("Enter Second number");
        r = s.nextInt();

        ncr = fact(n) / (fact(r) * fact(n - r));
        System.out.println("The NCR factor of " + n + " and " + r + " is " + ncr);
        System.out.print("The factor of " + n + " is" + fact(n));

    }

    private static int fact(int n) {

        int i = 1;
        while (n != 0) {
            i = i * n;
            n--;
        }

        return i;
    }
}
