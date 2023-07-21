package XPRACTICE;

import java.util.Scanner;

/* Java program to implement basic stack
operations */
class StackImpl {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return (top < 0);
    }

    StackImpl() {
        top = -1;
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + a[i]);
        }
    }
}

// Driver code
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StackImpl s = new StackImpl();
        // s.push(10);
        // s.push(20);
        // s.push(30);
        // System.out.println(s.pop() + " Popped from stack");
        // System.out.println("Top element is :" + s.peek());
        // System.out.print("Elements present in stack :");
        // s.print();

        int op, data;
        char ans = 'y';
        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");

            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Enter data to be pushed : ");
                    data = sc.nextInt();
                    s.push(data);
                    System.err.println(data + " is pushed .");

                    System.out.println("Elements present in stack :");
                    s.print();
                    System.out.println();
                    break;

                case 2:
                    s.pop();
                    System.out.println("Popped !");

                    System.out.println("Elements present in stack :");
                    s.print();
                    System.out.println();
                    break;
                case 3:
                    data = s.peek();
                    System.out.println(data + " is the peek value.");

                    System.out.println("Elements present in stack :");
                    s.print();
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid.");

            }
            System.out.println("Wanna continue y or n?");
            ans = sc.next().charAt(0);

        } while (ans == 'Y' || ans == 'y');
        sc.close();
    }
}
