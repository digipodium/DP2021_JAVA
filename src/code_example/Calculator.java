package code_example;

import java.util.Scanner;

public class Calculator {
    public int lastResult;

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        /* input is taken with the help of scanner class */
        Scanner scn = new Scanner(System.in);
        System.out.println("Addition");
        System.out.println("enter number 1 > ");
        int val = scn.nextInt();
        System.out.println("enter number 2 > ");
        int val2 = scn.nextInt();
        cal.lastResult = cal.add(val, val2);
        System.out.println("result >" + cal.lastResult);

    }

    public int add(int val, int val2) {
        return val + val2;
    }

    public int sub(int val, int val2) {
        return val - val2;
    }

}
