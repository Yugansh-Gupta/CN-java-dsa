package time_and_space_complexity;

import java.util.Arrays;

public class Duplicate {
    static int findDuplicate(int[] arr){
        if (arr.length==1){
            return arr[0];
        }
        Arrays.sort(arr);
        int i =0;
        while (i<arr.length-1){
            if (arr[i]==arr[i+1]){
                return arr[i];
            }
            i=i+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5,5,1,6,8,3,0,2,7,4};
        System.out.println(findDuplicate(arr));
    }
}
