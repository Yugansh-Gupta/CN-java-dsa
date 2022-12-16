package recursion2;

import java.util.Arrays;

public class MergesortRec {
    static void merge(int[] input,int sI,int eI){
        int mid = (sI+eI)/2;
        int m = mid-sI +1;
        int n = eI-mid;
        int[] res = new int[m+n];
        int k =0;
        int i=sI;
        int j=mid+1;
        while(i<=mid && j<=eI){
            if (input[i]>input[j]){
                res[k] = input[j];
                j++;
            }else{
                res[k] = input[i];
                i++;
            }
            k++;
        }
        while(i<=mid){
            res[k] = input[i];
            k++;
            i++;
        }
        while(j<=eI){
            res[k] = input[j];
            k++;
            j++;
        }
        for (int l = 0; l < m+n; l++) {
            input[l+sI] = res[l];
        }
    }

    static void mergeSortRec(int[] input,int sI,int eI){
        if (sI>=eI){
            return;
        }
        int mid = (sI+eI)/2;
        mergeSortRec(input,sI,mid);
        mergeSortRec(input,mid+1,eI);
        merge(input, sI, eI);
    }

    static void mergeSort(int[] input){
        mergeSortRec(input,0,input.length-1);
    }

    public static void main(String[] args) {
        int[] input = {2,6,8,5,4,3};
        mergeSort(input);
        System.out.println(Arrays.toString(input));
    }
}
