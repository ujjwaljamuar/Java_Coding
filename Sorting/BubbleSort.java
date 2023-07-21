package Sorting;

public class BubbleSort {

    /*
    public static void bubbleSort1(int arr[],int n){
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    */
    
    public static void bubbleSort2(int arr[],int n){
        int i,j,temp;
        boolean isSwapped;
        for(i = 0;i<n-1;i++){
            isSwapped = false;
            for(j = 0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(isSwapped == false){
                break;
            }
        }
    }
    public static void printArr(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,1,4,3,10};
        bubbleSort2(arr, arr.length);
        printArr(arr);
    }
}
