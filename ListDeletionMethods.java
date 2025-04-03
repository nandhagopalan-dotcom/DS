// List Deletion by using Position and Element

import java.util.*;
class Node{
    int data;
    Node next;
}
public class ListDeletion {
    public static void InsertAtPosition(Node head){   // Insertion using Position
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

    public static void DeleteAtPosition(Node head){   // Deletion by using Position
        System.out.println("Enter the Position you want to delete : ");
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        int c = 0;
        Node prev = head;
        while(c<(pos-1) && prev.next!=null)
        {
            c++;
            prev=prev.next;
        }
        if(c==(pos-1))
        {
            prev.next=prev.next.next;
        }
        else
        {
            System.out.println("Pos Exceeds Length");
        }
    }

    public static void DeleteByElement(Node head){     // Deletion by using Element
        System.out.println("Enter the value that you want to delete : ");
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        Node prev = head;
        while(prev.next!=null && prev.next.data!=e)
        {
            prev = prev.next;
        }
        if(prev.next == null)
        {
            System.out.println("Element not found");
        }
        else
        {
            prev.next=prev.next.next;
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
            InsertAtPosition(head);
        }
        display(head);
        System.out.println("    ");
        DeleteAtPosition(head);
        display(head);
        System.out.println("    ");
        DeleteByElement(head);
        display(head);
    }
}
