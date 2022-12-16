package recursion2;

public class CheckAB {
    static boolean checkAB(String input){
        if (input.charAt(0) != 'a'){
            return false;
        }else{
            if (input.length()==1){
                return true;
            } if (input.length()>=2) {
                if (input.charAt(1)=='a'){
                    return checkAB(input.substring(1));
                }
            } if (input.length()>=3) {
                if(input.charAt(1)=='b'&&input.charAt(2)=='b'){
                    return checkAB(input.substring(3));
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        String input = "aabbab";
        System.out.println(checkAB(input));
    }
}
