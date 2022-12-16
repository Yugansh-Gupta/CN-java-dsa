package recursion;

public class FindNum {
    static boolean checkNumber(int[] input, int x){
        int n = input.length;
        if (n==1){
            return input[0]==x;
        }
        int[] smallArray = new int[n-1];
        for (int i = 1; i < n; i++) {
            smallArray[i-1] = input[i];
        }
        boolean ans = checkNumber(smallArray,x);
        if (ans){
            return true;
        }if (input[0]==x){
            return true;
        }else{
            return false;
        }
    }
    static boolean checkNumberBetter(int[] input,int startIndex,int x){
        if (startIndex == input.length -1){
            return input[startIndex]==x;
        }
        boolean ans = checkNumberBetter(input, startIndex+1,x);
        if (ans){
            return true;
        }
        if (input[startIndex]==x){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int x = 3;
        System.out.println(checkNumberBetter(arr,0,x));
    }
}
