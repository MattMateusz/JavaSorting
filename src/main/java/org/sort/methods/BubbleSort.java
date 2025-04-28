package org.sort.methods;

import java.util.ArrayList;

import static java.util.Collections.swap;

public class BubbleSort extends BaseSort{
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> unsortedNumb) {
        for(int i = 0; i < unsortedNumb.size(); i++) {
            for(int j = 0; j < unsortedNumb.size() - 1; j++) {
                if(unsortedNumb.get(j) > unsortedNumb.get(j + 1)) {
                    swap(unsortedNumb, j, j + 1);
                }
            }
        }
        return unsortedNumb;
    }
}
