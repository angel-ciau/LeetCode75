

public class CommonDivisorStrings {
    public static void main(String[] args) {
        String word1 = "ABABAB";
        String word2 = "AB";

        CommonDivisorStrings commonDivisorStrings = new CommonDivisorStrings();
        String test = commonDivisorStrings.gcdOfStrings(word1, word2);
        System.out.println(test);
    }

    public String gcdOfStrings(String word1, String word2){
        if (!(word1 + word2).equals(word2 + word1)){
            return "";
        }

        int stringIndex = gcd(word1.length(),word2.length());
        return word1.substring(0, stringIndex);

    }
    public int gcd(int number1, int number2){
        if (number2 == 0){
            return number1;
        } else {
            return gcd(number2, number1 - number2);
        }
    }
}
