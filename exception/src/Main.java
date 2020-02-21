public class Main {

    public static void main(String[] args) {
        Methods methods = new Methods();

        try {
            methods.addition(-5, 5);        // Exception in thread "main" java.lang.IllegalArgumentException
            methods.subtraction(0, 5);      // Exception in thread "main" java.lang.ArithmeticException
            methods.multiplication(0, 0);   // java.lang.IllegalAccessException
            methods.division(5, 5);         // MyExceptions: Красавчик, ти вказав коректні дані ))))
        } catch (MyExceptions | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
