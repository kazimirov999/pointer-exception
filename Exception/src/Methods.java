public class Methods {
    static double subtract(double a, double b) throws MyExeption, IllegalArgumentException, ArithmeticException {
        verify(a, b);
        return a - b;
    }

    static double sum(double a, double b) throws MyExeption, IllegalArgumentException, ArithmeticException {
        verify(a, b);
        return a + b;
    }

    static double multyply(double a, double b) throws MyExeption, IllegalArgumentException, ArithmeticException {
        verify(a, b);
        return a * b;
    }

    static double divide(double a, double b) throws MyExeption, IllegalArgumentException, ArithmeticException {
        verify(a, b);
        return a / b;
    }


    static private void verify(double a, double b) throws MyExeption, IllegalArgumentException, ArithmeticException {
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException("Exception: value of both numbers is negative: " + a + " " + b);
        }

        if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
            throw new ArithmeticException("Exception: value of one of the numbers equals zero: " + a + " " + b);
        }

        if (a > 0 && b > 0) {
            throw new MyExeption("Exception: value of both numbers is bigger then 0: " + a + " " + b);
        }
    }


    static class MyExeption extends Exception {

        public MyExeption(String message) {
            super(message);
        }
    }
}

