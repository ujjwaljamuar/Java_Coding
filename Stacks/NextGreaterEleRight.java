package Stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

// using stack
public class NextGreaterEleRight {

    static void printNGE(int arr[],  int size) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for (int i = size - 1; i >= 0; i--) {

            // if stack is empty push -1 to the arraylist
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

        Collections.reverse(res);
        System.out.println(res);

    }

    // using brute force

    static void printNGER(int arr[], int n) {
        ArrayList<Integer> al2 = new ArrayList<>();
        int next, i, j;
        for (i = 0; i < n; i++) {
            next = -1;
            for (j = i + 1; j < n; j++) {
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
        printNGE(arr, n);

    }
}
