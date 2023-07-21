package Searching;

public class LinearSearch {
    static int linearSearch(int arr[], int n,int key){
        int i;
        for(i = 0;i<n;i++){
            if(arr[i] == key){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        int n = arr.length;
        int key = 92;
        int res = linearSearch(arr, n, key);
        if(res == 1){
            System.out.println("Key found");
        }else{
            System.out.println("Not found");
        }
    }
}
