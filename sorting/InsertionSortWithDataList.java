/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureandalgorithom.sort;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class InsertionSortWithDataList {

    private static List<Integer> myList = new ArrayList<>();
    private static int[] value = {1, 4, 5, 1, 3};
    private static int numberEntry = 1;

    public static void main(String[] args) {

        // Add value to the list 1 4 5 1 3
        for (int i = 0; i < value.length; i++) {
            myList.add(value[i]);
        }
        
        for (int i = 0; i < value.length; i++) {
            addValue(value[i]);
        }
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

    private static void addValue(Integer value) {

        if (myList.isEmpty()) {
            myList.add(value);
        } else if (value > myList.get(numberEntry - 1)) {
            numberEntry++;
            int j = numberEntry - 1;
            while (j > 0 && myList.get(j - 1) < value) {
                myList.set(j, myList.get(j - 1));
                j--;
            }
            myList.set(j, value);
        }
    }
}
