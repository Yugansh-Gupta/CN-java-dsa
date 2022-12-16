package time_and_space_complexity;

public class CheckRotate {
    static int arrayRotateCheck(int[] arr){
        int i=0;
        while (i<arr.length-1 && arr[i+1]>=arr[i]){
            i++;
        }
        if ((i+1)==arr.length){
            return 0;
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(arrayRotateCheck(arr));
    }
}
