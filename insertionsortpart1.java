import java.util.*;

public class Solution {

    // Function to perform the single-element insertion sort and print steps
    public static void insertionSort1(int n, int[] arr) {
        // Step 1: Store the value of the last (unsorted) element
        int target = arr[n - 1];
        int i = n - 2;

        // Step 2: Test lower indices successively from right to left
        while (i >= 0 && arr[i] > target) {
            // Shift the larger value one position to the right
            arr[i + 1] = arr[i];
            
            // Print the array after each shift
            printArray(arr);
            
            i--;
        }

        // Step 3: Insert the stored target into its correct sorted position
        arr[i + 1] = target;
        
        // Print the final array
        printArray(arr);
    }

    // Helper function to print array as space-separated integers
    private static void printArray(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + (j == arr.length - 1 ? "" : " "));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        insertionSort1(n, arr);
        scanner.close();
    }
}
