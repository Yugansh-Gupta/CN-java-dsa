package stack;

import java.util.Stack;

public class StockSpan {
    static int[] stockSpan(int[] price){
        int n = price.length;
        Stack<Integer> st = new Stack<Integer>();
        Stack<Integer> aux = new Stack<Integer>();
        int[] ans = new int[n];
        st.push(price[0]);
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            if (price[i]<=st.peek()){
                ans[i] = 1;
                st.push(price[i]);
            }else{
                int count =1;
                while(st.peek()<price[i] && !st.isEmpty()){
                    aux.push(st.pop());
                    count++;
                }
                while(aux.peek()!=null){
                    st.push(aux.pop());
                }
                st.push(price[i]);
                ans[i] = count;
            }
        }
        return ans;
    }
}
