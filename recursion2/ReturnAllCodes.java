package recursion2;


import java.util.Arrays;

public class ReturnAllCodes {
    static String[] getCode(String input){
        if(input.length()==0){
            return new String[] {};
        }if(input.length()==1){
            int d = input.charAt(0)-'0';
            char c = (char) ('a'+d-1);
            return new String[] {String.valueOf(c)};
        }
        String ans[] = getCode(input.substring(1));
        String res1[] = new String[2*ans.length];
        int k =0;
        for (int i = 0; i < ans.length; i++) {
            res1[k] = ans[i];
            k++;
        }
        //first number is
        int d = input.charAt(0)-'0';
        char c = (char) ('a'+d-1);
        for (int i =0; i < ans.length; i++) {
            res1[k] = c+ans[i];
            k++;
        }

        return res1;



    }
    //ascii to character (char)(Integer.parseInt(c)+97-1)
    //c = input.charAt(0);
    public static void main(String[] args) {
        String input = "1123";
        System.out.println(Arrays.toString(getCode(input)));
    }
}
