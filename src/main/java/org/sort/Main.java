package org.sort;

import org.sort.methods.BubbleSort;
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
        SelectSort newList = new SelectSort();
        ArrayList<Integer> numbers = newList.getNumbers(newSize);
        System.out.println("\r\n");
        newList.displayNumbers(numbers);
        newList.displayNumbers(newList.sort(numbers));
    }
}
