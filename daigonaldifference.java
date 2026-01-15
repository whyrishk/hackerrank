      int leftToRightSum = 0;
        int rightToLeftSum = 0;
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            // Primary diagonal (left-to-right): row index equals column index (i, i)
            leftToRightSum += arr.get(i).get(i);
            // Secondary diagonal (right-to-left): row index + column index equals n-1 (i, n-1-i)
            rightToLeftSum += arr.get(i).get(n - 1 - i);
        }

        // Return the absolute difference between the two sums
        return Math.abs(leftToRightSum - rightToLeftSum);
    }
}
 
