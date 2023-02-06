import java.util.Scanner;

public class LL1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Node head = null;
            int k = sc.nextInt();
            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                head = insert(head, x);
            }
            int ans = getNthNodeFromEnd(head, k);
            System.out.println(ans);
        }
    }
    public static int getNthNodeFromEnd(Node head, int n){
        if(head == null) return 0;
        while(head != null){
            n = getNthNodeFromEnd(head.next, n) + 1;
            if(n == 0) return head.val;
            n--;
        }
        return n;

    }
    public static Node insert(Node head, int x){
        Node temp = new Node(x);
        if(head == null) return temp;
        Node curr = head;
        while(curr.next != null) curr = curr.next;
        curr.next = temp;
        return head;
    }
}

class Node{
    	int val;
    	Node next;
    	Node(int x){
    		val = x; next = null;
    	}
    }

    // static void main(){
    //     Scanner sc = new Scanner(System.in);
    //     int t = sc.nextInt();
    //     while(t-->0){
    //         int L = sc.nextInt();
    //         int N = sc.nextInt();
    //         Node head = null;
    //         for (int i = 0; i<L; i++){
    //             int x = sc.nextInt();
    //             head = insert(head, x);
    //         }
    //         int ans = getNthNodeFromEnd(head, N);
    //         System.out.println(ans);
    //     } 
    // }
    // public static Node insert(Node head, int x){
    //     Node temp = new Node(x);
    //     if(head == null) return temp;
    //     Node curr = head;
    //     while(curr.next != null) curr = curr.next;
    //     curr.next = temp;
    //     return head;
    // }
    
    // static int getNthNodeFromEnd(Node head, int n){
    //     Node slow = head;
    //     Node fast = head;

    //     for (int i = 0; i < n; i++) {
    //         fast = fast.next;
    //     }

    //     while (fast != null) {
    //         slow = slow.next;
    //         fast = fast.next;
    //     }
    //     return slow.val;
    // }

    
    
    
    
    
    

