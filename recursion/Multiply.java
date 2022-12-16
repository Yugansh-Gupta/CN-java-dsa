package recursion;

public class Multiply {
    static int multiply(int m,int n){
        if(m==0){
            return 0;
        }
        m=m-1;
        return n+multiply(m,n);
    }
    public static void main(String[] args) {
        System.out.println(multiply(3,5));
    }
}
