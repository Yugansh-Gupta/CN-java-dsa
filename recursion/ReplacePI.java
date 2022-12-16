package recursion;

public class ReplacePI {
    static String replace(String input){
        if (input.length() < 2){
            return input;
        }
        if (input.charAt(0) == 'p' && input.charAt(1)=='i'){
            return "3.14"+replace(input.substring(2));
        }
        else{
            return input.substring(0,1)+replace(input.substring(1));
        }

    }
    public static void main(String[] args) {
        //input : xpix
        //output : x3.14x
        System.out.println(replace("xpix"));
    }
}
