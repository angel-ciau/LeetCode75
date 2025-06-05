import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlaceFlowers {
    public static void main(String[] args) {
        int[] list = {0,0,1,0,0,0,0,1,0,1,0,0,0,1,0,0,1,0,1,0,1,0,0,0,1,0,1,0,1,0,0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,0,1,0,0,0,1,0,0,1,0,0,1,0,0,0,1,0,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,0};
        int number = 17;
        canPlaceFlowers(list, number);
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int counter = 0;
        boolean result = false;
        if (flowerbed.length == 1){
            if (flowerbed[0] == 1 && n > 0){
                return false;
            }
            else if (flowerbed[0] == 0 && n > 1){
                return false;
            } else {return true;}
        }
        for (int i=0; i < flowerbed.length; i+=2){
            if (i != flowerbed.length - 1){
                if(flowerbed[i] == 0 && flowerbed [i+1] == 0 && flowerbed [i-1] == 0 ){
                    counter++;
                }
            } else {
                if(flowerbed[i] == 0 && flowerbed [i-1] == 0){
                    counter++;
                }
            }
            System.out.println("Counter= " + counter);
        }
        if (counter >= n){
            result = true;
        }
        return result;
    }
}
