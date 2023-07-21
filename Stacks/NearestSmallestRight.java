package Stacks;

import java.util.*;

public class NearestSmallestRight {
    static void NSR(int arr[], int n) {
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (s.size() == 0) {
                al.add(-1);
            } 
            else if (s.size() > 0 && s.peek() < arr[i]) {
                al.add(s.peek());
            } 
            else if (s.size() > 0 && s.peek() >= arr[i]) {
                while (s.size() > 0 && s.peek() >= arr[i]) {
                    s.pop();
                }
                if (s.size() == 0) {
                    al.add(-1);
                } 
                else {
                    al.add(s.peek());
                }
            }
            s.push(arr[i]);
        }

        Collections.reverse(al);
        System.out.println(al);
    }

    static void NSRBrute(int arr[], int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int next = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    next = arr[j];
                    break;
                }
            }
            al.add(next);
        }

        System.out.println(al);

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 2, 10, 8 }; // 2,2,-1,8,-1
        int n = arr.length;

        NSRBrute(arr, n);
        NSR(arr, n);

    }
}
