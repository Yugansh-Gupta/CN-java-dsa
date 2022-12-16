package recursion2;

public class BinarySearchRec {
    static int binarySearch(int arr[],int x,int start,int end){
        if(start>=end){
            return -1;
        }
        int mid = (end+start)/2;
        if(arr[mid]==x){
            return mid;
        } else if (x<arr[mid]) {
            return binarySearch(arr,x,start,mid-1);
        }else{
            return binarySearch(arr,x,mid+1,end);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,4,8,10,15,19,24,28,32,33,35};
        System.out.println(binarySearch(arr,28,0,arr.length));
    }
}
