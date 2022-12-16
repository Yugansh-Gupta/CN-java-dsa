package recursion;

public class CountZeros {
    static int countZeros(int input){
        if (input<10){
            if (input%10==0){
                return 1;
            }
            return 0;
        }
        int count = countZeros(input/10);
        if(input%10 == 0){
            return count+1;
        }else{
            return count;
        }
    }
    public static void main(String[] args) {
        int n = 10204;
        System.out.println(countZeros(n));
    }
}
