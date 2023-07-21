package Questions;
// Find the maximum sum of elements in an array where no two elements should be adjacent.
public class MaximumSum {


    public int findMaxSum(int arr[],int n){
        /*
        int[][] dp = new int[N][2];
        if (N == 1) {
        return arr[0];
        }
    
        // Initialize the values in dp array
        dp[0][0] = 0;
        dp[0][1] = arr[0];
    
        // Loop to find the maximum possible sum
        for (int i = 1; i < N; i++) {
            dp[i][1] = dp[i - 1][0] + arr[i];
            dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][0]);
        }
    
        
        return Math.max(dp[N - 1][0], dp[N - 1][1]);        */


        int included = arr[0];
        int excluded = 0;
        int newExcluded;

        for(int i = 1;i<n;i++){
            newExcluded = Math.max(included, excluded);
            included = excluded + arr[i];
            excluded = newExcluded;
        }
        return Math.max(included, excluded);
    }
    public static void main(String[] args) {
        MaximumSum sum = new MaximumSum();

        int arr[] = new int[] { 5, 5, 10, 100, 10, 5 };
        int N = arr.length;

        System.out.println(sum.findMaxSum(arr, N));
    }
}
