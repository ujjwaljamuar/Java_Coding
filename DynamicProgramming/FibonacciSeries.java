package DynamicProgramming;

import java.util.Arrays;

public class FibonacciSeries {

    public static void FibIter(int count){
        int n1=0,n2=1,n3,i;  
        System.out.print(n1+" "+n2);//printing 0 and 1    
           
        for(i=2;i<count;i++)//loop starts from 2 because 0 and 1 are already printed    
        {    
         n3=n1+n2;    
         System.out.print(" "+n3);    
         n1=n2;    
         n2=n3;    
        }  
    }

    
    public static void FibTab(int n, int dp[]) { // TC = O(n)
        // SC = O(n)
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

    }

    public static void printFib(int dp[]){
        for(int i = 0;i<dp.length;i++){
            System.out.print(dp[i] + " ");
        }
    }


    public static void main(String[] args) {
        int n = 6;
        
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;

        /*FibTab(n, dp);
        printFib(dp);

        FibIter(n); */

    }
}
