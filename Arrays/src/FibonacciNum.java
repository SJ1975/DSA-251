public class FibonacciNum {
     public int fib(int n) {
           // if(n<2){
        //     return n;
        // }

        // return fib(n-1) + fib(n-2);

        // Dynamic programming array to store Fibonacci numbers
        int[] dp = new int[n + 1];
        dp[0] = 0;

        if (n >= 1) {
            dp[1] = 1;
        }

        // Fill the dp array using previously calculated Fibonacci numbers
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // Return the nth Fibonacci number
        return dp[n];
    }
}
