package Sorting;

public class InsertionSort{
    public static void insertionSort(int arr[],int n){
        int i,j,temp;
        for(i = 1;i<n;i++){
            temp = arr[i];
            j = i-1;
            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static void printArr(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,1,9,2,10};
        int n = arr.length;
        insertionSort(arr,n);
        printArr(arr);
    }
}