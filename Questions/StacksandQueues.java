package Questions;

import java.util.*;

public class StacksandQueues {

    public static List<Integer> operation1(List<Integer> arr) {

        Stack<Integer> s = new Stack<Integer>();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < arr.size(); i++) {
            while (!s.isEmpty()) {
                q.add(s.pop());
            }
            s.push(arr.get(i));
            while (!q.isEmpty()) {
                s.push(q.poll());
            }

        }

        List<Integer> res = new ArrayList<>();
        while (!s.isEmpty()) {
            res.add(s.pop());
        }

        return res;

    }

    public static List<Integer> operation2(List<Integer> arr) {
        boolean directionRight = arr.size() % 2 == 0;
        LinkedList<Integer> l = new LinkedList<Integer>();
        if (directionRight) {
            l.add(arr.get(0));
            for (int i = 1; i < arr.size(); i++) {
                l.add(arr.get(i));
                i++;
                if (i < arr.size())
                    l.addFirst(arr.get(i));
            }
        } else {
            l.add(arr.get(0));
            for (int i = 1; i < arr.size(); i++) {
                l.addFirst(arr.get(i));
                i++;
                l.add(arr.get(i));
            }
        }

        return l;
    }

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();

        li.add(12);
        li.add(14);
        li.add(16);
        li.add(18);
        li.add(20);
        li.add(22);

        System.out.println(li + "\n");
        System.out.println(operation2(li));
    }
}
