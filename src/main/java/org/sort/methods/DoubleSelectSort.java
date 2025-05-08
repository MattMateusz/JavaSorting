package org.sort.methods;

import java.util.ArrayList;

import static java.util.Collections.swap;

public class DoubleSelectSort extends BaseSort{
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> unsortedNumbers) {
        int smallest = 0;
        int highest = unsortedNumbers.size() - 1;

        while (smallest < highest) {
            int minIndex = findIndexWithSmallestValue(unsortedNumbers, smallest, highest);
            int maxIndex = findIndexWithHighestValue(unsortedNumbers, smallest, highest);

            if (minIndex == highest && maxIndex == smallest) {
                swap(unsortedNumbers, minIndex, smallest);
                swap(unsortedNumbers, maxIndex, highest);
            } else {
                if (maxIndex == smallest) maxIndex = minIndex;
                swap(unsortedNumbers, minIndex, smallest);
                swap(unsortedNumbers, maxIndex, highest);
            }
            smallest++;
            highest--;
        }
        return unsortedNumbers;
    }

    private int findIndexWithSmallestValue(ArrayList<Integer> numbers, int start, int end) {
        int minIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (numbers.get(i) < numbers.get(minIndex)) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private int findIndexWithHighestValue(ArrayList<Integer> numbers, int start, int end) {
        int maxIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (numbers.get(i) > numbers.get(maxIndex)) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
