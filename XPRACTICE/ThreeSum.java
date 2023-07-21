// Print list of all triplets in an array whose sum equals to 0.
package XPRACTICE;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeesum(int[] num) {
        Arrays.sort(num);

        List<List<Integer>> res = new LinkedList<>();

        for (int i = 0; i < num.length - 2; i++) {
            if (i == 0 || (i > 0 && num[i] != num[i - 1])) {
                int lo = i + 1, hi = num.length - 1, sum = 0 - num[i];

                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        res.add(Arrays.asList(num[i], num[lo], num[hi]));

                        while (lo < hi && num[lo] == num[lo + 1])
                            lo++;
                        while (lo < hi && num[hi] == num[hi - 1])
                            hi--;

                        lo++;
                        hi--;
                    } else if (num[lo] + num[hi] < sum)
                        lo++;
                    else
                        hi--;
                }
            }
        }
        return res;                             // O(n2)
    }                                                                           

    public List<List<Integer>> thrsum(int nums[]) {          // brute force
        List<List<Integer>> result = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new LinkedList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        result = new LinkedList<>(new LinkedHashSet<>(result));
        return result;                                                  //O(n3)
    }

    public static void main(String[] args) {
        ThreeSum tr = new ThreeSum();
        int arr[] = { -2, -1, -1, -1, 0, 0, 0, 2, 2, 2, -2 };
        System.out.println(tr.thrsum(arr));
        System.out.println(tr.thrsum(arr).size());
        // System.out.println(tr.threeesum(arr));
        // System.out.println(tr.threeesum(arr).size());
    }
}