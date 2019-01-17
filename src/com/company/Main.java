package com.company;

public class Main {

    public static void main(String[] args) {

        int smallestNumber = 1;
        int maxDivisor = 20;


        /*  Joe Notes -
        This for loop will compare a counter against what is currently assigned to the
        smallestNumber variable.  If the remainder of the comparison is equal to 0, then
        the counter increases and then the smallest number is compared against the updated counter.

        If the comparison doesn't equal 0, then reset the counter (because the counter will need to be used
        again for the updated smallestNumber), and increment up the smallestNumber.
         */
        for (int counter = 1; counter <= maxDivisor; counter++) {
            if (smallestNumber % counter != 0) {
                counter = 1;
                smallestNumber++;
            }
        }
        System.out.println("The smallest number is " + smallestNumber);
    }
}
