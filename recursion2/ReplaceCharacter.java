package recursion2;

public class ReplaceCharacter {
    static String replaceCharacter(String input, char c1, char c2){
        if(input.length()==0){
            return input;
        }
        if(input.charAt(0)==c1){
            return replaceCharacter(c2+input.substring(1),c1,c2);
        }
        else{
            return input.substring(0,1)+replaceCharacter(input.substring(1),c1,c2);
        }
    }

    public static void main(String[] args) {
        System.out.println(replaceCharacter("abacd",'a','x'));
    }
}
