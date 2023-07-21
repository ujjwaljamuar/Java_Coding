package Questions;

import java.util.Scanner;

public class MaxOccOfNInInteger {
    
    static int maxOccEle(int key, int size, int arr[]) {
        int max = 0;
        int maxe = 0;

        for (int i = 0; i < size; i++) {
            int e = arr[i];
            int countn = 0;

            while (e != 0) {

                int rem = e % 10;
                if (rem == key) {
                    countn += 1;
                }
                e = e / 10;
                if (countn > max) {
                    max = countn;
                    maxe = i;
                }
            }
        }
        return arr[maxe];

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int size = sc.nextInt();
        int arr[] = { 225, 225, 2225, 24, 14 };

        /*
         * for(int i = 0;i<size;i++){
         * 
         * }
         */
        System.out.println(maxOccEle(key, size, arr));

        sc.close();

    }
}
