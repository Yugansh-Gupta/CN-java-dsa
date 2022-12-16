package recursion2;

import java.util.Arrays;

public class SubsetOfArray {
    static int[][] subsets(int[] input,int start,int end){
        if(start==end){
            int[][] ans = new int[2][1];
            ans[0] = new int[0];
            ans[1][0] = input[start];
            return ans;
        }
        int[][] smallAns= subsets(input,start+1,end);
        int[][] ans = new int[2*smallAns.length][];
        int m=0;
        for (int i = 0; i < smallAns.length; i++) {
            ans[m] = new int[smallAns[i].length];
            for (int j = 0; j < smallAns[i].length; j++) {
                ans[m][j] = smallAns[i][j];
            }
            m++;
        }
        for (int i = 0; i < smallAns.length ; i++) {
            ans[m] = new int[smallAns[i].length+1];
            ans[m][0] = input[start];
            for (int j = 0; j < smallAns[i].length; j++) {
                ans[m][j+1] = smallAns[i][j];
            }
            m++;
        }


        return ans;
    }

    public static void main(String[] args) {
        int[] input={15,15};
        System.out.println(Arrays.deepToString(subsets(input,0,input.length-1)));
    }
}
