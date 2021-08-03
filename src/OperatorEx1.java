public class OperatorEx1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        String buttercup = "buttercup";
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);

        if (a > b) {
            System.out.println("a is greater");
        } else {
            System.out.println("b is greater");
        }
        int c = a + b / a - b; // ctrl + alt + v for variable
        System.out.println("this is the ans:"+ c);
    }
}
