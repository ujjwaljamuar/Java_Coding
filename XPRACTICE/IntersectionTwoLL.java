package XPRACTICE;

public class IntersectionTwoLL {

    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public Node getIntersection(Node head1,Node head2){
        while(head2 != null){
            Node temp = head1;

            while(temp != null){
                if(temp == head2){
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
            }
        return null;
    }
    public static void main(String[] args) {
        
    }
}
