package stack;


// consider '(' : 1 and ')' : 2;
public class BalancedParenthesis {
    static boolean isBalanced(String s){
        int n = s.length();
        StackUsingLL st = new StackUsingLL();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch=='('){
                st.push(1);
            }else{
                if (st.top()==1){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
