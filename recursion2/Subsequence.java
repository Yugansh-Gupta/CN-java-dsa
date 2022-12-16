package recursion2;

import java.util.Arrays;

public class Subsequence {
    static String[] findSubsequences(String str){
        if(str.length()==0){
            return new String[] {""};
        }
        String smallAns[] = findSubsequences((str.substring(1)));
        String ans[] = new String[2*smallAns.length];
        for (int i = 0; i < smallAns.length; i++) {
            ans[i] = smallAns[i];
        }
        for (int i = 0; i < smallAns.length; i++) {
            ans[i+ smallAns.length] = str.charAt(0) + smallAns[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "xyz";
        System.out.println(Arrays.toString(findSubsequences(str)));
    }
}
