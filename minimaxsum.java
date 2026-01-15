  // Write your code here
        
        // Use a long to store the sums to prevent potential integer overflow,
        // as the sum of 4 of the 5 integers might exceed the maximum value of an int.
        long minSum = Long.MAX_VALUE;
        long maxSum = Long.MIN_VALUE;
        long totalSum = 0;

        // Iterate through the list to calculate the total sum and find the min and max elements.
        for (int num : arr) {
            totalSum += num;
            if (num < minSum) {
                minSum = num;
            }
            if (num > maxSum) {
                maxSum = num;
            }
        }

        // The minimum possible sum of four elements is the total sum minus the maximum element.
        long minimumFourSum = totalSum - maxSum;
        // The maximum possible sum of four elements is the total sum minus the minimum element.
        long maximumFourSum = totalSum - minSum;

        // Print the minimum and maximum sums on a single line separated by a space.
        System.out.println(minimumFourSum + " " + maximumFourSum);
    }
}
