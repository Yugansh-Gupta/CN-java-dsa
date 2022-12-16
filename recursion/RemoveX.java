package recursion;

public class RemoveX {
    static String removeX(String input){
        if (input.length() < 1){
            return input;
        }
        if (input.charAt(0) == 'x'){
            return removeX(input.substring(1));
        }
        else{
            return input.substring(0,1)+removeX(input.substring(1));
        }
    }

    public static void main(String[] args) {
        //input : xabx
        //output : ab
        System.out.println(removeX("xxxxboxxxxx"));
    }
}
