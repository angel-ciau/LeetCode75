import java.util.ArrayList;

public class ReverseVowels {
    public static void main(String[] args) {
        reverseVowels("Esteban");
    }
    // Esteban
    // 1,2,3,4,5,6,7

    // astebEn
    // 6,2,3,4,5,1,7
    // i ->
    //  length - i  <-

    // aeE
    // Esteban
    // astebEn
    // ast
    public static String reverseVowels(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        ArrayList<Character> invertedVowels = new ArrayList<>();
        int count = 0;
        for (int i=0; i < s.length(); i++){
            char c = s.charAt(s.length() - 1 - i);
            if (isVowel(c)){
                invertedVowels.add(c);
            }
        }
        for (int i=0; i < s.length(); i++){
            if (isVowel(s.charAt(i))){
                stringBuilder.setCharAt(i,invertedVowels.get(count));
                count++;
            }
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }
    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
