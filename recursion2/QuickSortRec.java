package recursion2;

import java.util.Arrays;

public class QuickSortRec {
    static int partition(int[] input,int sI,int eI){

        //taking pivotEl
        int pivotEl = input[sI];

        //counting the elements less than pivotEl
        int i =sI+1;
        int count = 0;
        while(i<=eI){
            if (input[i]<=pivotEl){
                count++;
            }
            i++;
        }
        int pivotPos = sI + count;

        //replacing the pivotEl
        input[sI] = input[sI+count];
        input[sI+count] = pivotEl;

        //swapping the elements
        i=sI;
        int j=eI;
        while (i<pivotPos && j>pivotPos){
            if (input[i]>pivotEl && input[j]<=pivotEl){
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--;
            }
            else if(input[i]>pivotEl && !(input[j]<=pivotEl)){
                j--;
            }else if(!(input[i]>pivotEl) && input[j]<=pivotEl){
                i++;
            }else{
                i++;
                j--;
            }

            //12,23,45,18,16,20,17,23
            //12,17,45,18,16,23,20,23
        }
        return pivotPos;

    }

    static void quickSortRec(int[] input,int sI,int eI){
        if (sI>=eI){
            return;
        }
        int pivotPos = partition(input,sI,eI);
        quickSortRec(input,sI,pivotPos-1);
        quickSortRec(input,pivotPos+1,eI);
    }

    static void quickSort(int[] input){
        quickSortRec(input,0,input.length-1);
    }

    public static void main(String[] args) {
        int[] input = {1,5,2,7,3};
        quickSort(input);
        System.out.println(Arrays.toString(input));
    }
}
