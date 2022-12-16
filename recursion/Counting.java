package recursion;

public class Counting {
    static void count(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        count(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        count(6);
    }
}
