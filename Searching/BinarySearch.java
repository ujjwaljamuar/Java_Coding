package Searching;

public class BinarySearch {
    public static int binarySearch(int[] nums, int key) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;

            if (nums[mid] == key) return mid;

            if (key < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 3, 4, 5, 6 };
        int key = 3;
        int res = binarySearch(arr, key);
        if (res == 0) {
            System.out.println("Key not Found .");
        } else {
            System.out.println("Key found at index " + res);
        }
    }
}