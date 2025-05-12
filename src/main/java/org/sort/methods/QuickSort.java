package org.sort.methods;

import java.util.ArrayList;

public class QuickSort extends BaseSort{
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> unsortedNumbers) {
        quickSort(unsortedNumbers, 0, unsortedNumbers.size() - 1);
        return unsortedNumbers;
    }
    public static void quickSort(ArrayList<Integer> list, int low, int high){
        if(low < high) {
            int piv = partition(list, low, high);

            quickSort(list, low, piv - 1);
            quickSort(list, piv + 1, high);
        }
    }

    public static int partition(ArrayList<Integer> list, int low, int high) {
        int pivot = list.get(high);
        int i = low - 1;

        for(int j = low; j <= high - 1; j++) {
            if(list.get(j) < pivot){
                i++;
                swap(list, i, j);
            }
        }
        swap(list, i + 1, high);
        return i + 1;
    }

    static void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
