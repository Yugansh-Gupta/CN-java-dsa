package time_and_space_complexity;

import java.util.Arrays;

public class FindUnique {
    static int findUnique(int[] arr){
        if (arr.length==1){
            return arr[0];
        }
        Arrays.sort(arr);
        int i =0;
        while (i<arr.length-1 && arr[i]==arr[i+1]){
            i=i+2;
        }
        return arr[i];
    }

    public static void main(String[] args) {
        int[] arr = {1,7,1,7,7};
        System.out.println(findUnique(arr));
    }
}
