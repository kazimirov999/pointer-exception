package poiner_exception;

import java.util.Scanner;

public class Methods extends Exception {

    Scanner scanner = new Scanner(System.in);
    private int a;
    private int b;

    void calculateVariable() throws Exception {
        System.out.println("what action to take");
        String comand = scanner.nextLine().toLowerCase();
        switch (comand) {
            case "add":
                addition();
                calculateVariable();
                break;
            case "sub":
                subtract();
                calculateVariable();
                break;
            case "multi":
                myltiplication();
                calculateVariable();
            case "div":
                division();
                break;
        }
    }

    public void addition() throws Exception {
        System.out.println("added number #1");
        int a = scanner.nextInt();
        System.out.println("added number #2");
        int b = scanner.nextInt();
        if (a < 0 && b < 0) throw new IllegalArgumentException("a or b are numbers with negative values");
        if (a == 0 && b != 0) throw new ArithmeticException("one of two numbers zero");
        if (a != 0 && b == 0) throw new ArithmeticException("one of two numbers zero");
        if (a == 0 && b == 0) throw new IllegalArgumentException("a or b are numbers with negative values");
        if (a > 10 && b > 10) throw new MyException("this is my exception, it works for three");
        a += b;
        System.out.println(a);
    }

    public void subtract() {
        System.out.println("added number #1");
        int s = scanner.nextInt();
        System.out.println("added number #2");
        int d = scanner.nextInt();
        s -= d;
        System.out.println(s);
    }

    public void myltiplication() {
        System.out.println("added number #1");
        int s = scanner.nextInt();
        System.out.println("added number #2");
        int d = scanner.nextInt();
        s *= d;
        System.out.println(s);
    }

    public void division() {
        System.out.println("added number #1");
        int s = scanner.nextInt();
        System.out.println("added number #2");
        int d = scanner.nextInt();
        s /= d;
        System.out.println(s);
    }

}

