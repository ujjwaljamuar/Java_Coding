package Stacks;

import java.util.*;

public class NextGreaterElementRight {
    
    static class Stack {
        int top;
        int items[] = new int[100];

        void push(int x) {
            if (top == 99) {
                System.out.println("Stack is full");
            } else {
                items[++top] = x;
            }
        }

        int pop() {
            if (top == -1) {
                System.out.println("Underflow");
                return -1;
            } else {
                int element = items[top];
                top--;
                return element;
            }
        }

        boolean isEmpty() {
            return (top == -1) ? true : false;
        }
    }

    static void printNGE(int arr[], int n) {
        int i = 0;
        Stack s = new Stack();
        s.top = -1;
        int element, next;

        ArrayList<Integer> al2 = new ArrayList<Integer>();

        /* push the first element to stack */
        s.push(arr[0]);

        // iterate for rest of the elements
        for (i = 1; i < n; i++) {
            next = arr[i];

            if (s.isEmpty() == false) {

                // if stack is not empty, then
                // pop an element from stack
                element = s.pop();

                /*
                 * If the popped element is smaller than
                 * next, then a) print the pair b) keep
                 * popping while elements are smaller and
                 * stack is not empty
                 */
                while (element < next) {
                    al2.add(next);
                    if (s.isEmpty() == true)
                        break;
                    element = s.pop();
                }

                /*
                 * If element is greater than next, then
                 * push the element back
                 */
                if (element > next)
                    s.push(element);
            }

            /*
             * push next to stack so that we can find next
             * greater for it
             */
            s.push(next);
        }

        /*
         * After iterating over the loop, the remaining
         * elements in stack do not have the next greater
         * element, so print -1 for them
         */
        while (s.isEmpty() == false) {
            element = s.pop();
            next = -1;
            al2.add(next);
        }

        System.out.println(al2);
    }

    /*
    brute force
    static void printNGE(int arr[], int n) {
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
    */

    public static void main(String args[]) {
        int arr[] = { 1, 3, 2, 4 };
        int n = arr.length;
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        

        for (int i : arr) {
            al1.add(i);
        }
        System.out.println(al1);
        printNGE(arr, n);
    }
}
