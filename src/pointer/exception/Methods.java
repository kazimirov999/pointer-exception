package pointer.exception;

public class Methods {

    private Methods() {}

    public static int sum(int a, int b) throws MyException, IllegalAccessException, MyException2 {
        verify(a, b);
        return a + b;
    }

    public static int subtract(int a, int b) throws MyException, IllegalAccessException, MyException2 {
        verify(a, b);
        return a - b;
    }

    public static int multiply(int a, int b) throws MyException, IllegalAccessException, MyException2 {
        verify(a, b);
        return a * b;
    }

    public static int divide(int a, int b) throws MyException, IllegalAccessException, MyException2 {
        verify(a, b);
        return a/b;
    }

    private static void verify(int a, int b) throws IllegalAccessException, MyException, MyException2 {
        if (a < 0 && b < 0)
            throw new IllegalArgumentException("Both arguments are less than zero.");

        if (a == 0 && b != 0)
            throw new ArithmeticException("The first argument is zero, the second is not zero.");

        if (a!=0 && b==0)
            throw new ArithmeticException("The first argument is not zero, the second is zero.");

        if (a == 0 && b == 0)
            throw new IllegalAccessException("Both arguments are zero.");

        if (a > 0 && b > 0)
            throw new MyException("Both arguments are bigger than zero.");

        if (a < 0 && b != 0)
            throw new MyException2("The first argument is less than zero, the second is not zero.");
    }
}

interface Formattable {
    String getFormattedString(int a, int b) throws Exception;
}