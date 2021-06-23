import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Task2Test {

    @ParameterizedTest
    @MethodSource("arrayToCheckOnesAndFoursProvider")
    public void shouldBeFalse(int[] inputArr){
        Assertions.assertFalse(Task2.isArrHasOnlyFoursAndOnes(inputArr));
    }

    private static Stream<Arguments> arrayToCheckOnesAndFoursProvider(){
        return Stream.of(
                Arguments.of(new int[] {1,1,1,1,1,1,1}),// Ненормальный массив из 1
                Arguments.of(new int[] {4,4,4,4,4,4}),// Ненормальный массив из 4
                Arguments.of(new int[] {1,1,1,4,4,1,4,4,6}),// Ненормальный массив из 1, 4 и другого числа
                Arguments.of(new int[] {3,6,8}) // Массив из чисел без 1 и 4
        );
    }
    // Нормальный массив из 1 и 4
    @Test
    public void shouldBeTrue(){
        Assertions.assertTrue(Task2.isArrHasOnlyFoursAndOnes(new int[] {1,1,1,4,4,1,4,4}));
    }

}
