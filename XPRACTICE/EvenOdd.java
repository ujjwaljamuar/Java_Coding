package XPRACTICE;

import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        
        String res = (n^1) == n+1 ? "Even":"Odd";           // XOR ^ - if res is n+1 then even, else odd
        System.out.println(n + " is " + res + " number");
        
        String res1 = (n&1) == 1?"Odd":"Even";             //&:  if output is 1 then odd, of 0 then even
        System.out.println(n + " is " + res1 + " number");

        sc.close();
    }
}
