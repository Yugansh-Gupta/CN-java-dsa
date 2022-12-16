package recursion;

public class FindFirstIndex {
    static int firstIndex(int[] input,int startIndex,int x){
        if (startIndex == input.length -1){
            if(input[startIndex]==x){
                return startIndex;
            }else{
                return -1;
            }

        }
        if(input[startIndex]==x){
            return startIndex;
        }

        return firstIndex(input, startIndex+1,x);

    }
    public static void main(String[] args) {
        int[] arr = {2,5,4,6,4,7};
        System.out.println(firstIndex(arr,0,4));
    }
}
