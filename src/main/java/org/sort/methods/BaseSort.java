package org.sort.methods;

import java.util.ArrayList;

public abstract class BaseSort {

    public void displayNumbers(ArrayList<Integer> numbersList) {
        System.out.println("=-=-=-=-=-= START =-=-=-=-=-=");

        for(int i = 0; i < numbersList.size(); i++) {
            System.out.println(numbersList.get(i));
        }

        System.out.println("=-=-=-=-=-= STOP =-=-=-=-=-=");
    }

    public int getRandomNumber() {
        return (int)(Math.random() * 101);
    }

    public ArrayList<Integer> getNumbers(Integer size) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            numbers.add(getRandomNumber());
        }
        return numbers;
    }
    public abstract ArrayList<Integer> sort(ArrayList<Integer> unsortedNumbers);

}
