public class FibonacciNumber {

    public static void main(String[] args) {
       System.out.println(fibonacciRecursive(10));
    }

    /**
     * вычисление n-ого элемента последовательности Фибоначчи
     * @param n - элемент последовательности Фибоначчи
      */

    public static int fibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacciRecursive(n - 2) + fibonacciRecursive(n - 1);
    }

}

