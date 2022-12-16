package recursion2;

public class RemoveDuplicate {
    static String removeConsecutiveDuplicates(String s){
        if (s.length()<2){
            return s;
        }
        if(s.charAt(0)==s.charAt(1)){
            return removeConsecutiveDuplicates(s.substring(1));
        }
        else{
            return s.substring(0,1)+removeConsecutiveDuplicates(s.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("aaabbccda"));
    }
}
