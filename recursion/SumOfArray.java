package recursion;

public class SumOfArray {
    static int sum(int[] input){
        int n = input.length;
        if(n==1){
            return input[0];
        }
        int[] smallArray = new int[n-1];
        for (int i = 1; i < n; i++) {
            smallArray[i-1] = input[i];
        }
        return input[0]+sum(smallArray);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(sum(arr));
    }
}
