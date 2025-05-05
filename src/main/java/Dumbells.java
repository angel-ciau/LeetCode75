import java.util.List;

public class Dumbells
{
    public static void main(String[] args) {
        List<Integer> lista = List.of(3, 2, 5, 3, 7);
        int max = 6;

        Dumbells dumbells = new Dumbells();
        System.out.println(dumbells.weightCapacity(lista, max));
    }

    public int weightCapacity(List<Integer> weights, int maxCapacity) {
        // Write your code here
        int currentMax = 0;
        for(int i = 0; i < weights.size()-1; i++){
            for (int p = i + 1; p < weights.size()-1; p++ ){
                System.out.println("Current i: " + i);
                System.out.println("Current p: " + p);
                System.out.println("weights.get(i): " + weights.get(i));
                System.out.println("weights.get(p): " + weights.get(p));

                if((currentMax < (weights.get(i) + weights.get(p))) && ((weights.get(i) + weights.get(p)) <= maxCapacity)){
                    currentMax = weights.get(i) + weights.get(p);
                    System.out.println(currentMax);
                }
                if (currentMax == maxCapacity){
                    System.out.println("Max cap reached");
                    return currentMax;
                }
            }
        }

        return currentMax;
    }
}
