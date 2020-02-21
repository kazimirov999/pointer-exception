public class Methods {

    public void verification(int a, int b) throws IllegalAccessException, MyExceptions {
        if (a < 0 || b < 0) throw new IllegalArgumentException();
        if ((a == 0 & b != 0) || (a != 0 & b == 0)) throw new ArithmeticException();
        if (a == 0 & b == 0) throw new IllegalAccessException();
        if (a > 0 & b > 0) throw new MyExceptions("Красавчик, ти вказав коректні дані ))))");
    }

    public int addition(int a, int b) throws MyExceptions, IllegalAccessException {
        verification(a, b);
        return a + b;
    }

    public int subtraction(int a, int b) throws MyExceptions, IllegalAccessException {
        verification(a, b);
        return a - b;
    }

    public int multiplication(int a, int b) throws MyExceptions, IllegalAccessException {
        verification(a, b);
        return a * b;
    }

    public double division(int a, int b) throws MyExceptions, IllegalAccessException {
        verification(a, b);
        return a / b;
    }
}
