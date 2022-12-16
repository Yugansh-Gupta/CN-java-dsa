package recursion;

public class numberOfDigits {
    static int digits(int num){
        if(num==0){
            return 0;
        }
        return 1+digits(num/10);
    }
    public static void main(String[] args) {
        System.out.println(digits(54321));
    }
}
