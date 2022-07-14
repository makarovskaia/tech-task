import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    public static Stream<Arguments> fibonacci() {
        return Stream.of(Arguments.of(4, 3),
                Arguments.of(10, 55),
                Arguments.of(15, 610),
                Arguments.of(8, 21)
        );
    }

    @ParameterizedTest(name = "Проверка последовательности Фибоначчи: позитивный сценарий, параметр {0} == {1}")
    @MethodSource("fibonacci")
    public void fibonacciRecursiveSuccessfulTest(int n, int expectedResult) {
        int result = FibonacciNumber.fibonacciRecursive(n);
        assertEquals(expectedResult, result);
    }


}
