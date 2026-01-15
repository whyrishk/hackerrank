 int n = arr.size();
        if (n == 0) return;

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        // Calculate ratios and print with six decimal places
        System.out.printf("%.6f%n", (double) positiveCount / n);
        System.out.printf("%.6f%n", (double) negativeCount / n);
        System.out.printf("%.6f%n", (double) zeroCount / n);
    }
}
