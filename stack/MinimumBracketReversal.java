package stack;
import java.util.Stack;

public class MinimumBracketReversal {
    static int countBracketReversals(String input){
        int n = input.length();
        int ans = 0;
        if(n%2!=0){
            return -1;
        }
        Stack<Character> st = new Stack<Character>();
        Stack<Character> aux = new Stack<Character>();
        for (int i = 0; i < n; i++) {
            if(input.charAt(i)!='}'){
                st.push(input.charAt(i));
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    ans+=1;
                    st.push('{');
                }
            }
        }
        if(st.size()!=0){
            while(st.size()!=0){
                char p = st.pop();
                if(p=='{'){
                    if (aux.isEmpty() && aux.peek()=='{'){
                        ans+=1;
                        aux.pop();
                    }else{
                        aux.push(p);
                    }
                }
            }
        }
        return ans;
    }
}
