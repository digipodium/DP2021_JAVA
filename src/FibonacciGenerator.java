public class FibonacciGenerator {
    private int[] generate() {
        int[] fib = new int[10];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
        }
        return fib;
    }

    private void show(int[] fib) {
        for (int i = 0; i < fib.length; i++) {
            System.out.print(fib[i]+" ");
        }
    }

    public static void main(String[] args) {
        FibonacciGenerator gen = new FibonacciGenerator();
        int[] series = gen.generate();
        gen.show(series);
    }

}
