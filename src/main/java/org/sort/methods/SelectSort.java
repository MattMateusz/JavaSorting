package org.sort.methods;

import java.util.ArrayList;

import static java.util.Collections.swap;

public class SelectSort extends BaseSort{
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> unsortedNumbers) {
        for(int i = 0; i < unsortedNumbers.size() - 1; i++) {
            int index = findIndeksWithSmalestValue(unsortedNumbers, i);
            swap(unsortedNumbers, index, i);
        }
        return unsortedNumbers;
    }

    public static Integer findIndeksWithSmalestValue(ArrayList<Integer> numbers, int crazyNumber) {
        int index = crazyNumber;
        int value = numbers.get(crazyNumber);
        for(int i = crazyNumber; i < numbers.size(); i++) {
            if(numbers.get(i) < value) {
                value = numbers.get(i);
                index = i;
            }
        }
        return index;
    }
}
