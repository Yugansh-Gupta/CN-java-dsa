package recursion2;

import java.util.Arrays;

public class Keypad {
    static String[] helper(int digit){
        if (digit==2){
            return new String[] {"a","b","c"};
        }
        else if (digit==3){
            return new String[] {"d","e","f"};
        }
        else if (digit==4){
            return new String[] {"g","h","i"};
        }
        else if (digit==5){
            return new String[] {"j","k","l"};
        }
        else if (digit==6){
            return new String[] {"m","n","o"};
        }
        else if (digit==7){
            return new String[] {"p","q","r","s"};
        }
        else if (digit==8){
            return new String[] {"t","u","v"};
        }
        else if (digit==9){
            return new String[] {"w","x","y","z"};
        }
        else {
            return new String[] {""};
        }
    }
    static String[] keypad(int n){
        if (Integer.toString(n).contains("1") || Integer.toString(n).contains("0")){
            System.out.print(""+" ");
        }
//        if(n==0){
//            return new String[] {""};
//        }
        String[] smallStr = keypad(n/10);
        String[] helper = helper(n%10);
        String[] ans = new String[helper.length * smallStr.length];
        int k=0;
        for (int i = 0; i < helper.length; i++) {
            for (int j = 0; j < smallStr.length; j++) {
                ans[k] = smallStr[j] + helper[i];
                k++;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int num =0;
        System.out.println(Arrays.toString(keypad(num)));
    }
}
