public class MergeStrings {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "fgh";

        MergeStrings mergeStrings = new MergeStrings();
        String test = mergeStrings.mergeTwoStrings(word1, word2);
        System.out.println(test);
    }

    public String mergeTwoStrings(String word1, String word2){
        StringBuilder result = new StringBuilder();
        if (word1.length() > word2.length()) {
            System.out.println("Cond 1");
            int i = 0;
            do {
                result.append(word1.charAt(i)).append(word2.charAt(i));
                i++;
            } while (i < word2.length());
                result.append(word1.substring(word2.length()));
        } else {
            System.out.println("Cond 2");
            int i = 0;
            do {
                result.append(word1.charAt(i)).append(word2.charAt(i));;
                i++;
                System.out.println(i);
            } while (i < word1.length());
                result.append(word2.substring(word1.length()));
        }
        return result.toString();
    }

    public String mergeTwoStrings2(String word1, String word2){
        StringBuilder result = new StringBuilder();
        int max = Math.max(word1.length(), word2.length());
        for (int i = 0; i < max; i++) {
            if (i < word1.length()){
                result.append(word1.charAt(i));
            }
            if (i < word2.length()){
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }

    public String printTest(){
        String line = "juan";
        System.out.println(line);
        return  line;
    }

    public void stringLength(String word){
        System.out.println(word.length());
    }
}
