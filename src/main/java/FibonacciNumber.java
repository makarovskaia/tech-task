public class FibonacciNumber {

    /**
     * вычисление n-ого элемента последовательности Фибоначчи
     *
     * @param n - элемент последовательности Фибоначчи
     */

    public static int fibonacciRecursive(int n) {
        checkParameterIsPositive(n);
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacciRecursive(n - 2) + fibonacciRecursive(n - 1);
    }

    private static void checkParameterIsPositive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число n должно быть больше или равно 0");
        }
    }

}

