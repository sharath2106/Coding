package problems.chapter2.Day1.Leetcode;

import java.util.Arrays;

public class DuplicateZeroes {
    public static void main(String[] args) {
        DuplicateZeroes duplicateZeroes = new DuplicateZeroes();
        duplicateZeroes.duplicateZeros(new int[]{1, 2, 0, 3, 0, 9, 5});
    }

    public void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int length = arr.length - 1;

        // Find the number of zeros to beD duplicated
        // Stopping when left points beyond the last element in the original array
        // which would be part of the modified array
        for (int left = 0; left <= length - possibleDups; left++) {

            // Count the zeros
            if (arr[left] == 0) {

                // Edge case: This zero can't be duplicated. We have no more space,
                // as left is pointing to the last element which could be included
                if (left == length - possibleDups) {
                    // For this zero we just copy it without duplication.
                    arr[length] = 0;
                    length--;
                    break;
                }
                possibleDups++;
            }
        }

        // Start backwards from the last element which would be part of new array.
        int last = length - possibleDups;

        // Copy zero twice, and non zero once.
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }

        Arrays.stream(arr).forEach(System.out::println);
    }
}
