package stack;

import java.util.Stack;

public class RedundantBrackets {
    static boolean checkRedundantBrackets(String expression){
        Stack<Character> st = new Stack<Character>();
        Stack<Character> aux = new Stack<Character>();
        int b = expression.length();
        for (int i = 0; i < b; i++) {
            if (expression.charAt(i)!=')') {
                st.push(expression.charAt(i));
            }else{
                while(st.peek()!='('){
                    aux.push(st.pop());
                }
                st.pop();
                if (aux.size()<=1){
                    return true;
                }
            }
        }
        return false;
    }
}
