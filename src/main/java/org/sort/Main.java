package org.sort;



import org.sort.methods.BaseSort;
import org.sort.methods.BubbleSort;

import java.util.ArrayList;

public class Main extends BaseSort{
    public static void main(String[] args) {
        int size = 12;
        BubbleSort unsortedList = new BubbleSort();
        ArrayList<Integer> list = unsortedList.getNumbers(size);
        unsortedList.displayNumbers(list);
        unsortedList.sort(list);
        unsortedList.displayNumbers(list);
    }

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> unsortedNumbers) {
        return null;
    }
}
