package DataS;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data =data;
    }
}
public class Linkedlist {
    public static void main(String[] args) {
        Node A = new Node(1);
        Node B = new Node (2);
        System.out.println(A.next = B);
    }
}
