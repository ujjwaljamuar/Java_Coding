package XPRACTICE;
// O(nlogn)
import java.util.*;

public class PrintPrime1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N;
        N = sc.nextInt();

        sc.close();
        int M = (N - 1) / 2;
        int arr[] = new int[M];
        int i, j;
        for (i = 0; i < M; i++) // i=0 ; 0<10
        {
            arr[i] = i + 1; // arr[0]=1
        }
        int z;
        i = 1;
        j = 1;
        while (true) {
            z = i + j + 2 * i * j;
            if (i == j && z > M) {
                break;
            } else if (z <= M) {
                arr[z - 1] = -1;
                j++;
            } else {
                i++;
                j = i;
            }
        }
        System.out.print("2 ");

        for (i = 0; i < M; i++) {
            if (arr[i] != -1) {
                System.out.print(2 * arr[i] + 1 + " ");
            }
        }

        

        
    }
}