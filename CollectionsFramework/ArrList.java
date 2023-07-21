package CollectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// vectors are less efficient than arraylist because they are synchronized
public class ArrList {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7 };
        ArrayList<Integer> al = new ArrayList<>();

        al.add(5);
        al.add(1);
        al.add(3);
        al.add(4);

        System.out.println(al);

        // Sort Arrays
        Arrays.sort(arr);

        // Sort List from collections framework
        Collections.sort(al);

        System.out.println("Sorted Arraylist : " + al);
        System.out.println("size of arraylist is " + al.size());

        // returns specific postion
        System.out.println(al.indexOf(5));

        ArrayList<Integer> cloneNumber = (ArrayList<Integer>) al.clone();
        System.out.println("cloned arraylist : " + cloneNumber);

        System.out.println("SubList: " + cloneNumber.subList(1, 3));

        cloneNumber.set(1, 5); // replace
        cloneNumber.add(2, 44); // add element at position and shift previous to right

        System.out.println(al.contains(5)); // true

        // al.ensureCapacity(3); // use to set max capacity of arraylist

        al.clear(); // deletes every element and faster than removeAll()
        System.out.println(al);

        // suppose you want to insert all elements at once in arrayList,
        // one way to do that

        Integer[] array = { 10, 20, 30, 40, 50, 60 };
        List<Integer> l1 = new ArrayList<>();

        l1.addAll(Arrays.asList(array));

        System.out.println(l1);

    }
}
