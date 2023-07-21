package XPRACTICE;

import java.util.Scanner;

public class SubstringPalindrome {
    public static int findPalindromesInSubString(String input, int j, int k) {
        int count = 0;
        for (; j >= 0 && k < input.length(); --j, ++k) {
            if (input.charAt(j) != input.charAt(k)) {
                break;
            }
            System.out.println(input.substring(j, k + 1));
            count++;
        }
        return count;
    }

    public static int findAllPalindromeSubstrings(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); ++i) {
            count += findPalindromesInSubString(input, i - 1, i + 1);
            count += findPalindromesInSubString(input, i, i + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();

        int count = findAllPalindromeSubstrings(str);
        System.out.println("Total palindrome substrings: " + count);

        sc.close();
    }
}
