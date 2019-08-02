public class Methods {
    public static int summate(int a, int b) throws IllegalAccessException {
        checkForExceptions(a, b);
        return a + b;
    }

    public static int subtract(int a, int b) throws IllegalAccessException {
        checkForExceptions(a, b);
        return a - b;
    }

    public static int multiply(int a, int b) throws IllegalAccessException {
        checkForExceptions(a, b);
        return a * b;
    }

    public static int divide(int a, int b) throws IllegalAccessException {
        checkForExceptions(a, b);
        return a / b;
    }

    private static void checkForExceptions(int a, int b) throws IllegalAccessException {
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException("A and B are both less than zero");
        }
        if (a == 0 && b != 0) {
            throw new ArithmeticException("A is equal zero and B is not equal zero");
        }
        if (a != 0 && b == 0) {
            throw new ArithmeticException("B is equal zero and A is not equal zero");
        }
        if (a == 0 && b == 0) {
            throw new IllegalAccessException("A and B are both equal zero");
        }
        if (a > 0 && b > 0) {
            throw new MyException("A and B are both more than zero");
        }
    }
}
