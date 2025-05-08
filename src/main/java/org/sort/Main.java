package org.sort;

import org.sort.methods.BubbleSort;
import org.sort.methods.DoubleSelectSort;
import org.sort.methods.SelectSort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int size = 12;
        BubbleSort unsortedList = new BubbleSort();
        ArrayList<Integer> list = unsortedList.getNumbers(size);
        unsortedList.displayNumbers(list);
        unsortedList.displayNumbers(unsortedList.sort(list));

        int newSize = 20;
        DoubleSelectSort newList = new DoubleSelectSort();
        ArrayList<Integer> numbers = newList.getNumbers(newSize);
        System.out.println("\r\n");
        newList.displayNumbers(numbers);
        newList.sort(numbers);
        newList.displayNumbers(numbers);
    }
}
