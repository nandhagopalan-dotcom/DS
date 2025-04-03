// Singly Linked List -> Insertion at Beginning, Insertion at End, Insertion at Given Position

import java.util.*;
class Node{
    int data;
    Node next;
}
public class ListInsertion {
    // Full Insertion Concepts (Beginning, End, Given Position)

    public static void InsertAtBeginning(Node head){
        Node obj = new Node();
        System.out.println("      ");
        System.out.println("Enter the values of the list to Insert at Beginning : ");
        Scanner sc = new Scanner(System.in);
        obj.data = sc.nextInt();
        obj.next = head.next;
        head.next = obj;
    }

    public static void InsertAtEnd(Node head){
        Node obj = new Node();
        System.out.println("      ");
        System.out.println("Enter the values of the list to Insert at End : ");
        Scanner sc = new Scanner(System.in);
        obj.data = sc.nextInt();
        Node l = head; // l -> temporary variable for traversal
        while(l.next != null){
            l = l.next;
        }
        l.next = obj;
        obj.next = null;
    }

    public static void InsertAtPosition(Node head){
        int c = 0; // c -> counter variable
        Node prev = head;
        System.out.println("      ");
        System.out.println("Enter the values of the list to Insert at Given Position : ");
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        while(c < (pos-1) && prev.next != null){
            c++;
            prev = prev.next;
        }
        if(c == (pos-1)){
            Node obj = new Node();
            obj.data = sc.nextInt();
            obj.next = prev.next;
            prev.next = obj;
        }
        else{
            System.out.println("Position Exceeds length");
        }
    }

    public static void display(Node head) {
        Node temp = head.next;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args){
        Node head = new Node();
        head.next = null;
        System.out.println("Enter the N value : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            InsertAtBeginning(head);
        }
        System.out.println("  ");
        display(head);
        System.out.println("  ");
        for(int i=0;i<n;i++){
            InsertAtEnd(head);
        }
        System.out.println("  ");
        display(head);
        System.out.println("  ");
        for(int i=0;i<n;i++){
            InsertAtPosition(head);
        }
        System.out.println("  ");
        display(head);
        System.out.println("  ");
    }
} 

OUTPUT :

