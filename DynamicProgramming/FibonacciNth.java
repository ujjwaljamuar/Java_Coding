package DynamicProgramming;

import java.util.*;

public class FibonacciNth {
    public static int fibRec(int n) {
        if (n <= 1)
            return n;                           // TC - (2^n)
        return fibRec(n - 1) + fibRec(n - 2);
    }

    public static int fibMem(int n, int dp[]) {
        if (n <= 1)
            return n;

        if (dp[n] != -1)
            return dp[n];
        // TC = O(n)
        return dp[n] = fibMem(n - 1, dp) + fibMem(n - 2, dp);           // SC = O(n) + O(n)

    }

    public static int fibTab1(int n, int dp[]) {                    // TC = O(n)
                                                                    // SC = O(n)
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];

    }

    public static int fibTab2(int n, int dp[]) {
        int prev2 = 0;
        int prev = 1;

        for (int i = 2; i <= n; i++) {
            int curri = prev + prev2;
            prev2 = prev;
            prev = curri;
        }
                                                            // TC = O(n)
        return prev;                                        // SC = O(1)
    }

    public static void main(String[] args) {

        int n = 6;
        
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;

        // System.out.println(fibRec(n));
        //System.out.println(fibMem(n, dp));

        //System.out.println(fibTab1(n, dp));
        System.out.println(fibTab2(n, dp));
    }
}
