package Questions;

import java.util.LinkedList;

class ListNode{
    int val;
    ListNode next;

    ListNode(){

    }
    ListNode(int val){
        this.val = val;
    }

    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumLinkedList {
    public static ListNode addTwoNum(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        int carry = 0;
        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum/10;
            ListNode node = new ListNode(sum %10);
            temp.next = node;
            temp = temp.next;

        }
        return dummy.next;
    }

    public static LinkedList<Integer> addTwo(LinkedList<Integer> l1,LinkedList<Integer> l2){
        LinkedList<Integer> l3 = new LinkedList<>();
        int carry = 0;
        for (int i = l1.size()-1; i >= 0; i--) {
            int parseInt1 = Integer.parseInt(l1.get(i).toString());
            int parseInt2 = Integer.parseInt(l2.get(i).toString());
            int sum = parseInt1+parseInt2+carry;
            int value = sum%10;
            carry = sum/10;
            l3.add(value);
        }
        return l3;
    }
    public static void main(String[] args) {
        // LinkedList<Integer> ll1 =  new LinkedList<>();
        // LinkedList<Integer> ll2 =  new LinkedList<>();

        // ll1.add(2);
        // ll1.add(4);
        // ll1.add(3);

        // ll2.add(5);
        // ll2.add(6);
        // ll2.add(7);
        // ll2.add(9);

        // System.out.println(addTwo(ll1, ll2));

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(7);
        l2.next.next.next = new ListNode(9);

        System.out.println(addTwoNum(l1, l2));

        
        
    }
}
