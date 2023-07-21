package XPRACTICE;

import java.util.Scanner;

public class BinToDec {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int row[] = new int[r];
        int row1[] = new int[r];
        String arr[] = new String[r];
        int max = 0;

        for (int i = 0; i < r; i++) {
            row[i] = sc.nextInt();
            String s = Integer.toString(row[i]);                // typecast integer to string
            arr[i] = s;

            row1[i] = Integer.parseInt(arr[i], 2);      // change binary to decimal but takes only string
            if (row1[i] > max) {
                max = i;
            }
        }

        System.out.println(max);

        sc.close();
    }
}
//Git Accessed
// Access complete