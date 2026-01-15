import java.io.*;
import java.util.*;

public class Solution {

    /**
     * Sorts an array using the Insertion Sort algorithm and counts the total number of shifts performed.
     *
     * @param arr The array of integers to be sorted.
     * @return The total number of shifts required to sort the array.
     */
    public static int runningTime(int[] arr) {
        int shifts = 0;
        int n = arr.length;

        // Start from the second element (index 1) as the first element is already sorted by itself
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                shifts++; // A shift occurs here
            }
            arr[j + 1] = key;
        }

        return shifts;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();

        int totalShifts = runningTime(arr);
        System.out.println(totalShifts);
    }
}
