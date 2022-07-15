import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {

    public static Stream<Arguments> fibonacci() {
        return Stream.of(Arguments.of(4, 3),
                Arguments.of(0, 0),
                Arguments.of(1, 1),
                Arguments.of(10, 55),
                Arguments.of(15, 610),
                Arguments.of(8, 21)
        );
    }

    @ParameterizedTest(name = "Проверка последовательности Фибоначчи: позитивный сценарий, параметр {0} == {1}")
    @MethodSource("fibonacci")
    public void fibonacciRecursivePositiveTest(int n, int expectedResult) {
        int result = FibonacciNumber.fibonacciRecursive(n);
        assertEquals(expectedResult, result);
    }


    public static Stream<Arguments> negativeFibonacci() {
        return Stream.of(Arguments.of(-1),
                Arguments.of(-6)
        );
    }


    @ParameterizedTest(name = "Проверка последовательности Фибоначчи: негативный сценарий (параметр {0}, ошибка: {1})")
    @MethodSource("negativeFibonacci")
    public void fibonacciRecursiveNegativeTest(int n) {
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> FibonacciNumber.fibonacciRecursive(n));
        assertEquals("Число n должно быть больше или равно 0", illegalArgumentException.getMessage());
    }

}
