package com.company;

public class Main {

    public static void main(String[] args) {

        int number = 10;
        int smallestNumber = 0;
        boolean isItAMultiple = true;

        for (int counter = 2; counter <= number; counter++) {

            for (int multiple = 1; multiple <= number; multiple++) {
                if (counter % multiple != 0) {
                    isItAMultiple = false;
                }
            }
            if (isItAMultiple = true) {
                smallestNumber = counter;
            }
        }
        System.out.println("The smallest number is " + smallestNumber);
    }
}
