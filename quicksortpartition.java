import java.io.*;
import java.util.*;

class Result {

    public static List<Integer> quickSort(List<Integer> arr) {
        int pivot = arr.get(0);

        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int x : arr) {
            if (x < pivot) {
                left.add(x);
            } else if (x == pivot) {
                equal.add(x);
            } else {
                right.add(x);
            }
        }

        List<Integer> result = new ArrayList<>();
        result.addAll(left);
        result.addAll(equal);
        result.addAll(right);

        return result;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        List<Integer> res = Result.quickSort(arr);

        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
