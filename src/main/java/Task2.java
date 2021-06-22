public class Task2 {
    public static boolean isArrHasOnlyFoursAndOnes(int [] arr){
        boolean hasFours = false;
        boolean hasOnes = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                hasOnes = true;
            else if (arr[i] == 4)
                hasFours = true;
            else return false;
        }
        return (hasFours && hasOnes);
    }
}
