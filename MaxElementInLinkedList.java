Find the Maximum element of the Linked List

CODE :

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head = null;
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    /*void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " "); 
            temp = temp.next;
        }
        System.out.println(); 
    }*/
    void max(){
        Node temp = head.next;
        int max = head.data;
        while(temp!=null){
            if(temp.data > max)
                max = temp.data;
            temp = temp.next;
        }
        System.out.println(max);
        
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList list = new LinkedList();
        while (true) {
            int value = s.nextInt();
            if (value == -1) { 
                break;
            }
            list.insert(value);
        }
        list.max();
    }
}
