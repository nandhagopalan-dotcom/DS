Infix to Postfix using Stack operations in java

CODE :

import java.util.*;

public class Solution4 {
    // Function to return precedence of operators
    int prec(char c) {
        if (c == '^') return 3;
        else if (c == '/' || c == '*') return 2;
        else if (c == '+' || c == '-') return 1;
        else return -1;
    }

    // Function to perform infix to postfix conversion
    void infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the character is an operand, add it to the output
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } 
            // If the character is '(', push it to stack
            else if (c == '(') {
                st.push(c);
            } 
            // If the character is ')', pop until '(' is found
            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result.append(st.pop());
                }
                st.pop(); // Remove '('
            } 
            // If an operator is found
            else {
                while (!st.isEmpty() && prec(c) <= prec(st.peek())) {
                    if (c == '^' && st.peek() == '^') break; // Handle right associativity for '^'
                    result.append(st.pop());
                }
                st.push(c);
            }
        }

        // Pop remaining elements
        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        Solution4 ans = new Solution4();
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine().trim(); // Trim to avoid non-ASCII spaces
        ans.infixToPostfix(exp);
    }
}
