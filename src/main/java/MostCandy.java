import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MostCandy {
    public static void main(String[] args) {

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList resultList = new ArrayList<>();
        int max = Arrays.stream(candies).max().orElse(0);

        for (int candy: candies
             ) {
            if (candy > max){
            resultList.add(true);} else {resultList.add(false);}
        }
        return resultList;
        }

}
