// Binary tree implementation and computing Pre-Order, In-Order and Post-Order traversals.

import java.util.*;

class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTreeImpl{
    Node root = null;
    void BuildBinaryTree(){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        if(val == -1)
            return;
        root = new Node(val);
        Queue <Node> q = new LinkedList<>();
        q.offer(root);                  // root node value added in queue
        while(!q.isEmpty()){
            Node currentNode = q.poll();   // root node value popped out as a current node
            int leftData = sc.nextInt();
            if(leftData != -1){
                currentNode.left = new Node(leftData);
                q.offer(currentNode.left);
            }
            int rightData = sc.nextInt();
            if(rightData != -1){
                currentNode.right = new Node(rightData);
                q.offer(currentNode.right);
            }
        }
    }

    void preOrder(Node root){              // Argument always be the root -> indicates Starting point of traversal
        if(root == null){                  // Pre-Order traversal -> Root -> Left -> Right
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void inOrder(Node root){               // Argument always be the root -> indicates the starting point of traversal
        if(root == null){                  // In-Order traversal -> Left -> Root -> Right
            return;
        }               
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    void postOrder(Node root){             // Argument always be the root -> indicates the starting point of traversal
        if(root == null){                  // Post-Order traversal -> Left -> Right -> Root
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}

public class BinaryTree{
    public static void main(String[] args) {
        BinaryTreeImpl tree = new BinaryTreeImpl();             // object for the class BinaryTreeImpl (tree)
        tree.BuildBinaryTree();
        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
    }
}
