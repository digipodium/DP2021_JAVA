public class EvenSum {
    int total = 0;
    private void doSum() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
    }

    private void show() {
        System.out.println("even number total in range of 1 - 100 is " + total);
    }

    public static void main(String[] args) {
        EvenSum es = new EvenSum();
        es.doSum();
        es.show();
    }
}
