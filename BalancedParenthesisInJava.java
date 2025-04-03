balanced Parenthesis using Stack in Java

CODE :

import java.io.*;
import java.util.*;

public class Solution {
    static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{')     // push the character if it is True
                st.push(ch);
            else{
                if(st.isEmpty())
                    return false;
                char top = st.pop();
                if(ch == '(' && top != ')')
                    return false;
                if(ch == '{' && top != '}')
                    return false;
                if(ch == ']' && top != '[')
                    return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 
        System.out.println(isBalanced(str));
    }
}
