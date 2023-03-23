package Exploring_Tree;

public class Tree_implementation{
    public static void main(String[] args) {
        Node root =  new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("PreOrder Traversal of a tree is :");
        root.preorderTraversal(root);
        System.out.println();

        System.out.print("In Order Traversal of a tree is :");
        root.inorderTraversal(root);
        System.out.println();

        System.out.print("PostOrder Traversal of a tree is :");
        root.postorderTraversal(root);
        System.out.println();
    }
}

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }

    public int getData() {
        return data;
    }

    public void preorderTraversal(Node node){
        if( node == null){
            return;
        } 
        System.out.print(node.data+" ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public void inorderTraversal(Node node){
        if( node == null){
            return;
        } 
        inorderTraversal(node.left);
        System.out.print(node.data+" ");
        inorderTraversal(node.right);
    }
    public void postorderTraversal(Node node){
        if( node == null){
            return;
        } 
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data+" ");
    }


}