public class CountSort {

    // Find maximum element
    static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    // Counting Sort
    static void countSort(int[] arr) {
        int max = findMax(arr);
        int[] count = new int[max + 1];

        // Store frequency
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Rebuild sorted array
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[k++] = i;
                count[i]--;
            }
        }
    }

    // Display array
    static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 2, 5};

        countSort(arr);   // Correct call
        display(arr);
    }
}
