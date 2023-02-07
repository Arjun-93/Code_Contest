package Contest5;

public class LL2 {
    public static void main(String[] args) {

    }

    Node merge(Node head1, Node head2) {

        Node new_head = null;
        while (head1.next != null | head2.next != null) {
            if (head1.val <= head2.val) {
                int temp = head1.val;
                new_head.val = temp;
            } else {
                new_head.val = head2.val;
            }
        }
        return head2;

    }
}

class Node {
    int val;
    Node next;

    Node() {
        next = null;
    }

    Node(int x) {
        val = x;
        next = null;
    }
}
