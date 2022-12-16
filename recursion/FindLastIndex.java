package recursion;

public class FindLastIndex {
    static int lastIndex(int[] input,int endIndex,int x){
        if (endIndex == 0){
            if(input[endIndex]==x){
                return endIndex;
            }else{
                return -1;
            }

        }
        if(input[endIndex]==x){
            return endIndex;
        }

        return lastIndex(input, endIndex-1,x);

    }

    public static void main(String[] args) {
        int[] arr = {2,5,4,6,4,7};
        System.out.println(lastIndex(arr,arr.length-1,4));
    }
}
