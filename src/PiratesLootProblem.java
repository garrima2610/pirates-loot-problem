import java.util.ArrayList;

public class PiratesLootProblem {
    public static void main(String[] args) {
        PiratesLootProblem p = new PiratesLootProblem();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(6);
        arr.add(2);
        arr.add(7);
        arr.add(5);
        arr.add(2);
        arr.add(1);
        arr.add(9);
        arr.add(5);
        System.out.println("The number of days: " + p.getMinimumDays(arr));
    }

    int count = 0;
    int getMinimumDays(ArrayList<Integer> loots){
        boolean isLootFound ;
        int size = loots.size();
        for (int i=0;i<size;i++){
            isLootFound = false;
            for(int j=0;j<loots.size()-1;j++){
                if (loots.get(j)<loots.get(j+1) ){
                    loots.remove(j+1);
                    isLootFound = true;
                }
            }
            if (isLootFound){
                count++;
            }
        }
        return count;
    }
}
