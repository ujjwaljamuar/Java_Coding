package Stacks;

import java.util.*;

public class NextGreaterEleLeft {

    static void printNGEL(int arr[], int size) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < size; i++) {
            if (s.size() == 0) {
                res.add(-1);
            }
            // if stack is not empty and top value is greater than arr[i] add to the result
            else if (s.size() > 0 && s.peek() > arr[i]) {
                res.add(s.peek());
            }

            // if stack is not empty and peek value is less than arr[i]
            else if (s.size() > 0 && s.peek() <= arr[i]) {
                while (s.size() > 0 && s.peek() <= arr[i]) {
                    s.pop();
                }

                // if the stack is empty insert -1 to the result
                if (s.size() == 0) {
                    res.add(-1);
                }
                // if the stack is not empty add the peek element to the result
                else {
                    res.add(s.peek());
                }
            }
            s.push(arr[i]);
        }

        System.out.println(res);

    }

    static void printNGEL2(int arr[], int n) {
        ArrayList<Integer> al2 = new ArrayList<>();
        int next, i, j;
        for (i = 0; i < n; i++) {
            next = -1;
            for (j = i -1; j >= 0; j--) {
                if (arr[i] < arr[j]) {
                    next = arr[j];
                    break;
                }
            }
        al2.add(next);
        }
        System.out.println(al2);
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 4 };
        int n = arr.length;

        ArrayList<Integer> al1 = new ArrayList<>();
        for (int i : arr) {
            al1.add(i);
        }
        System.out.println(al1);
        printNGEL(arr, n);
        printNGEL2(arr, n);

    }
}
