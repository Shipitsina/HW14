import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1Test {

    @Test
    public void shouldAddNewArraySuccessfully1(){

        Assertions.assertArrayEquals(new int[]{1,7}, Task1.arrAfterFour(new int[] {1,2,4,4,2,3,4,1,7}));
    }

    // Если 4 последняя
    @Test
    public void shouldAddNewArraySuccessfully2(){

        Assertions.assertArrayEquals(new int[]{}, Task1.arrAfterFour(new int[] {1,2,4,4,2,3,4}));
    }

    // Если 4 первая
    @Test
    public void shouldAddNewArraySuccessfully3(){

        Assertions.assertArrayEquals(new int[]{1,7}, Task1.arrAfterFour(new int[] {4,4,2,3,4,1,7}));
    }

    // Если все 4
    @Test
    public void shouldAddNewArraySuccessfully4(){

        Assertions.assertArrayEquals(new int[]{}, Task1.arrAfterFour(new int[] {4,4,4,4,4,4,4,4,4}));
    }

    // Если нет 4
    @Test
    public void shouldThrowRuntimeException(){
        Assertions.assertThrows(RuntimeException.class, () ->Task1.arrAfterFour(new int[] {1,2,1,7}));
    }
}



