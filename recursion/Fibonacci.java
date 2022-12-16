package recursion;

public class Fibonacci {
    static void fibonacci(int a,int b,int n){
        if(n==0){
            return;
        }
        System.out.print(a+" ");
        n=n-1;
        fibonacci(b,a+b,n);

    }
    public static void main(String[] args) {
//        a is first number
//        b is second number
//        n is the number of terms required
        fibonacci(0,1,8);
    }
}
