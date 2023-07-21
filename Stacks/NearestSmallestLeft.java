package Stacks;

import java.util.*;

public class NearestSmallestLeft {

    static void NSL(int arr[], int n) {
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (s.size() == 0) {
                al.add(-1);
            } else if (s.size() > 0 && s.peek() < arr[i]) {
                al.add(s.peek());
            } else if (s.size() > 0 && s.peek() >= arr[i]) {
                while (s.size() > 0 && s.peek() >= arr[i]) {
                    s.pop();
                }

                if (s.size() == 0) {
                    al.add(-1);
                } else {
                    al.add(s.peek());
                }
            }
            s.push(arr[i]);
        }

        System.out.println(al);

    }

    static void NSLBrute(int arr[], int n) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(-1);           // first element will always be -1
        for (int i = 1; i < n; i++) {
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    al.add(arr[j]);
                    break;
                }
            }
            if (j == -1)
                al.add(-1);
            
        }

        System.out.println(al);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 2, 10, 8 }; // -1,4,-1,2,2
        int size = arr.length;
        NSLBrute(arr, size);
        NSL(arr, size);
    }
}
