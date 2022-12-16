package time_and_space_complexity;

import java.util.Arrays;

public class Rotate {
    static void rotate(int[] arr,int d){
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = d; i <arr.length ; i++) {
            temp[j] = arr[i];
            j++;
        }
        for (int i = 0; i < d; i++) {
            temp[j] = arr[i];
            j++;
        }
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,6,11,12,17};
        int d=4;
        rotate(arr,d);
        System.out.println(Arrays.toString(arr));
    }
}
