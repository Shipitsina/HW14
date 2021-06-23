import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Task1Test {

    @ParameterizedTest
    @MethodSource("arrayToChangeProvider")
    public void shouldAddNewArraySuccessfully1(int [] outputArr, int [] inputArr){

        Assertions.assertArrayEquals(outputArr, Task1.arrAfterFour(inputArr));
    }

    private static Stream<Arguments> arrayToChangeProvider(){
        return Stream.of(
                Arguments.of(new int[]{1,7}, new int[] {1,2,4,4,2,3,4,1,7}),
                Arguments.of(new int[]{},new int[] {1,2,4,4,2,3,4}),// Если 4 последняя
                Arguments.of(new int[]{1,7},new int[] {4,4,2,3,4,1,7}),// Если 4 первая
                Arguments.of(new int[]{},new int[] {4,4,4,4,4,4,4,4}) // Если все 4
        );
    }

    // Если нет 4
    @Test
    public void shouldThrowRuntimeException(){
        Assertions.assertThrows(RuntimeException.class, () ->Task1.arrAfterFour(new int[] {1,2,1,7}));
    }
}



