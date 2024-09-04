static long sumOfDivisors(int N){
    long totalSum = 0;

    for (int i = 1; i <= N; i++) {
        // Number of multiples of i in the range 1 to N
        int numMultiples = N / i;
        
        // Contribution of i to the total sum
        totalSum += (long) i * numMultiples;
    }

    return totalSum;
}

