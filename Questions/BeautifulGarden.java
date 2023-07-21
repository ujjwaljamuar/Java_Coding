package Questions;

import java.util.*;


public class BeautifulGarden {
    public static int cost(List<Integer> li){
        int i,cost = 0;
        int l= 0;
        int size = li.size();
        System.out.println("Initial list: "+li);
        for(i = 0;i<size-1;i++){
            if(li.get(i+1) > li.get(i)){
                l = li.get(i+1) - li.get(i);
                li.set(i+1, li.get(i+1)-l);

                cost += l;
            }
        }

        System.out.println("Final list:   "+li);

        return cost;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(9);

        System.out.println("Cost = "+cost(list));
        
    }
}

