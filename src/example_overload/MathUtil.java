package example_overload;

public class MathUtil {
    public int[] fibonacciSeries() {
        int[] fib = new int[10];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
        }
        return fib;
    }
}
