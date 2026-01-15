import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {

        // Step 1: Frequency array (0 to 99)
        int[] count = new int[100];

        // Step 2: Count occurrences
        for (int i = 0; i < arr.size(); i++) {
            count[arr.get(i)]++;
        }

        // Step 3: Build sorted list
        List<Integer> sorted = new ArrayList<>();

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                sorted.add(i);
                count[i]--;
            }
        }

        return sorted;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().trim().split(" ");
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(arrTemp[i]));
        }

        List<Integer> result = Result.countingSort(arr);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));
            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
