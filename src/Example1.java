public class Example1 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            checkPrime(i);
        }
    }

    private static void checkPrime(int num) {
        int flag = 1; // default value for flag
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = 0;
                break;
            }
        }

        if (flag == 1) {
            System.out.print(num + ",");
        }
    }
}
