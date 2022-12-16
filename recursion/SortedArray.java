package recursion;

public class SortedArray {
    static boolean is_sorted(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return true;
        }
        if (arr[0] > arr[1]) {
            return false;
        }
        int[] smallInput = new int[n - 1];
        for (int i = 1; i < n; i++) {
            smallInput[i - 1] = arr[i];
        }
        boolean ans = is_sorted(smallInput);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7};
        System.out.println(is_sorted(arr));
    }
}

