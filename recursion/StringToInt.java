package recursion;

public class StringToInt {
    static int convertStringToInt(String input){
        if (input.length()==0){
            return 0;
        }
        if (input.charAt(0)!=0){
            return Integer.parseInt(input);
        }
        return convertStringToInt(input.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(convertStringToInt(""));
    }
}
