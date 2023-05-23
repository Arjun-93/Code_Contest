
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next =null;
    }
}

class Linked_List{
    Node head;

    public Node insert(Linked_List list, int data){
        Node curr = new Node(data);

        if(head == null){
            list.head = curr;
        } else{
            while(head.next == null){

            }
        }
        return new Node(data);
    }
}


public class LinkedList {
    public static void main(String[] args) {

    }
}



