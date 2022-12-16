package recursion;

public class Palindrome {
    static boolean isStringPalindrome(String input){
        int start = 0;
        int end = input.length() - 1;
        if (start >= end){
            return true;
        }
        if (input.charAt(start) == input.charAt(end)){
            return isStringPalindrome(input.substring(start+1,end));
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isStringPalindrome("naanr"));
    }
}
