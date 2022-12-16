package recursion;

public class PairStar {
    static String addStars(String input){
        if (input.length() < 2){
            return input;
        }
        if (input.charAt(0) == input.charAt(1)){
            return input.charAt(0)+"*"+addStars(input.substring(1));
        }
        else{
            return input.substring(0,1)+addStars(input.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(addStars("aaaa"));
    }
}
