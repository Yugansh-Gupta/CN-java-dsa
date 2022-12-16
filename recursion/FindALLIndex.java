package recursion;

import java.util.Arrays;

public class FindALLIndex {
    static int[] reverse(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int dump = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = dump;
        }
        return arr;
    }
    static int[] firstIndex(int[] input,int startIndex,int x){
        if (startIndex == input.length -1){
            if(input[startIndex]==x){
                return new int[] {startIndex};
            }else{
                return new int[] {};
            }
        }
        int[] temp = firstIndex(input, startIndex+1,x);
        if(input[startIndex]==x){
            temp = Arrays.copyOf(temp,temp.length+1);
            temp[temp.length-1]=startIndex;
            return reverse(temp);
        }
        return reverse(temp);
    }

    public static void main(String[] args) {
        int[] arr = {2,5,4,6,4,7,4};
        System.out.println(Arrays.toString(firstIndex(arr,0,4)));
    }
}
