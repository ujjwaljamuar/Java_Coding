package DynamicProgramming;

//import java.util.Arrays;

public class MaximumSumNonAdj {
    /*
    public static int solveUntil(int ind,int arr[],int dp[]){
        if(ind <0) return 0;
        if(ind == 0) return arr[ind];
        if(dp[ind] != -1 ) return dp[ind];
        int pick1 = arr[ind] + solveUntil(ind-2, arr, dp);
        int pick2 = 0+ solveUntil(ind-1, arr, dp);

        return dp[ind] = Math.max(pick1, pick2);
    }
    public static int solve(int n, int arr[]){
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        return solveUntil(n-1,arr,dp);
    }*/

    public static int getMax(int n,int arr[]){
        int prev = arr[0];
        int prev2 = 0;

        for(int i = 1;i<n;i++){
            int pick1 = arr[i];
            if(i > 1) pick1+= prev2;
            
            int pick2 = 0+prev;

            int curri = Math.max(pick1, pick2);
            prev2 = prev;
            prev = curri;

        }

        return prev;

    }
    public static void main(String[] args) {
        int arr[] = {2,1,4,9};
        int n = arr.length;
        //System.out.println(solve(n, arr));
        System.out.println("Maximum sum of non adjacent element is "+ getMax(n, arr));

    }
}
