package Searching;

import java.util.Scanner;

public class SearchInMatrix {
    public void search(int mat[][], int n, int x) {
        int i = 0, j = n - 1;
        // element

        while (i < n && j >= 0) {
            if (mat[i][j] == x) {
                System.out.print("Element found at " + i + " " + j);
                return;
            }
            if (mat[i][j] > x)
                j--;
            else // if mat[i][j] < x
                i++;
        }

        System.out.print("Element not found !");
        return;
    }

    public static void main(String[] args) {
        SearchInMatrix s = new SearchInMatrix();
        int mat[][] = { { 10, 11, 12, 13 },
                        { 14, 15, 16, 17 },
                        { 18, 19, 20, 21 },
                        { 22, 23, 24, 25 } };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        s.search(mat, 4, n);

        sc.close();
    }
}
