package recursion;

public class Fibonacci_2 {
    static int nth_num(int n){
        if(n==0){
//            0th element is zero
            return 0;
        } else if (n==1) {
//            1st number is 1
            return 1;
        }
        return nth_num(n-1) + nth_num(n-2);
    }

    public static void main(String[] args) {
        System.out.println(nth_num(8));
    }
}
