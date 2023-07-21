package XPRACTICE;

import java.util.HashMap;

public class OddOccNum {

    static void getOddOccurrence(int arr[])
    {
        int n = arr.length;
        HashMap<Integer,Integer> hmap = new HashMap<>();
         
        // Putting all elements into the HashMap
        for(int i = 0; i < n; i++)
        {
            if(hmap.containsKey(arr[i]))
            {
                // If array element is already present then
                // increase the count of that element.
                hmap.put(arr[i], hmap.get(arr[i])+ 1);
            }
            else
                 
                // if array element is not present then put
                // element into the HashMap and initialize
                // the count to one.
                hmap.put(arr[i], 1);
        }
 
        // Checking for odd occurrence of each element present
        // in the HashMap
        for(Integer a:hmap.keySet())
        {
            if(hmap.get(a) % 2 != 0)
                System.out.println(a);
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {2,2,2,5,5,7,7,9};
        int length = arr.length;
        for(int i = 0;i<length;i++){
            int count = 0;
            for(int j = 0;j<length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count % 2 != 0){
                System.out.println(arr[i]);
            }
        }

        getOddOccurrence(arr);
    }
}
