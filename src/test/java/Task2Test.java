import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2Test {

    // Нормальный массив из 1 и 4
    @Test
    public void shouldBeTrue1(){
        Assertions.assertTrue(Task2.isArrHasOnlyFoursAndOnes(new int[] {1,1,1,4,4,1,4,4}));
    }

    // Ненормальный массив из 1
    @Test
    public void shouldBeFalse1(){
        Assertions.assertFalse(Task2.isArrHasOnlyFoursAndOnes(new int[] {1,1,1,1,1,1,1}));
    }

    // Ненормальный массив из 4
    @Test
    public void shouldBeFalse2(){
        Assertions.assertFalse(Task2.isArrHasOnlyFoursAndOnes(new int[] {4,4,4,4,4,4}));
    }

    // Ненормальный массив из 1, 4 и другого числа
    @Test
    public void shouldBeFalse3(){
        Assertions.assertFalse(Task2.isArrHasOnlyFoursAndOnes(new int[] {1,1,1,4,4,1,4,4,6}));
    }

    // Ненормальный массив из 1, 4 и другого числа
    @Test
    public void shouldBeFalse4(){
        Assertions.assertFalse(Task2.isArrHasOnlyFoursAndOnes(new int[] {3,6,8}));
    }
}
