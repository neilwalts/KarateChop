
package ubs.walterne.karateChop;

import java.util.Arrays;

/**
 * Write a binary chop method that takes an integer search target and a sorted array of integers.
 * It should return the integer index of the target in the array, or -1 if the target is not in the array.
 * The signature will logically be: int chop(int, array_of_int)
 */
public class KarateChop {

    private int highPoint;
    private static final int HALF = 2;
    private static final int FAILED_SEARCH = -1;
    private int searchCounter = 0;

    public int chop(int target, int[] listOfValues) {
        highPoint = (listOfValues.length - 1);
        if (highPoint == FAILED_SEARCH) return highPoint;
        Arrays.sort(listOfValues);
        return searchList(target, listOfValues, (highPoint / HALF));
    }

    private int searchList(int target, int[] listOfValues, int half) {
        do {
            if (listOfValues[half] == target) return half;
            half = findNextHalfPoint(target, listOfValues, half);
            searchCounter++;
        } while (half != FAILED_SEARCH);

        System.out.println("Search counter: " + searchCounter + " List: " + Arrays.toString(listOfValues));
        return half;
    }

    private int findNextHalfPoint(int target, int[] listOfValues, int half) {
        if (half == highPoint) half = FAILED_SEARCH;
        else if (listOfValues[half] > target && half != 0) half = setHalfLower(half);
        else if (listOfValues[half] < target && half != 0) half = setHalfHigher(half);
        else half = FAILED_SEARCH;
        return half;
    }

    private int setHalfLower(int half) {
        highPoint = half;
        half = half / HALF;
        return half;
    }

    private int setHalfHigher(int half) {
        // You've just checked the one before the end (half == highpoint -1),
        // but rounding will mean you'll continue to select that one.
        // This line forces you to check the end of the list
        if (half == highPoint - 1) half = highPoint;
        else half += (highPoint - half) / HALF;
        return half;
    }
}