package XPRACTICE;

public class MaxSoFar {
    public static void main(String[] args) {

        int i;
        int [] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (i = 0; i < n; i++) {
            max_ending_here = max_ending_here + arr[i]; // step 1
            if (max_ending_here > max_so_far) {
                max_so_far = max_ending_here; // step 2
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }
        
        System.out.println(max_so_far);

    }
}
