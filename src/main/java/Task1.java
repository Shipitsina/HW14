
public class Task1 {

    public static int [] arrAfterFour(int [] oldArr){

        for (int i = oldArr.length - 1; i >= 0; i--) {
            if (oldArr[i] == 4) {
                i++;
                int [] newArr = new int[oldArr.length - i];
                for (int j = 0; j < newArr.length; j++) {
                    newArr[j] = oldArr [i + j];
                }
                return newArr;
            }
        }
        throw new RuntimeException("There is no number 4 in array!");
    }
}

