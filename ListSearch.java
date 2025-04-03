// Searching Operatons on list and Finding its length

import java.util.*;
class Node{
    int data;
    Node next;
}
public class ListSearch{
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

     public static void length(Node head)
    {
        Node temp = head.next;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp =temp.next;
        }
        System.err.println("     ");
        System.out.println("Length of the List is "+c);
    }


    public static void ListSearch(Node head){
        Node temp = head.next;
        int e;
        System.out.println("      ");
        System.out.println("Enter the value to Search the element in the List : ");
        Scanner sc=new Scanner(System.in);
        e=sc.nextInt();
        int c=0;
        while(temp!=null && temp.data!=e)
        {
            temp = temp.next;
            c++;
        }
        if(temp == null)
        {
            System.out.println("Not found");
        }
        else
        {
            System.out.println("Found at position  "+(c+1));
        }

    }

    public static void display(Node head){
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
        ListSearch(head);
        length(head);
    }
}
