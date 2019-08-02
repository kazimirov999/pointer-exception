package pointer.exception;

public class Main {

    public static void main(String[] args) {
        int[] arrA = new int[] {-10, 0, 10} , arrB = new int[] { -5, 0, 5};

        doMethodTest(arrA, arrB, "Methods.sum(a, b):",
                (a,b) -> String.format("---> %d + %d = %d", a, b, Methods.sum(a, b)) );
        doMethodTest(arrA, arrB, "Methods.subtract(a, b):",
                (a,b) -> String.format("---> %d - %d = %d", a, b, Methods.subtract(a, b)) );
        doMethodTest(arrA, arrB, "Methods.multiply(a, b):",
                (a,b) -> String.format("---> %d * %d = %d", a, b, Methods.multiply(a, b)));
        doMethodTest(arrA, arrB, "Methods.divide(a, b):",
                (a,b) -> String.format("---> %d / %d = %d", a, b, Methods.divide(a, b)));
    }

    private static void doMethodTest(int[] arrA, int[] arrB, String message, Formattable format) {
        System.out.println(message);

        for (int a : arrA) {
            for (int b : arrB) {
                try {
                    System.out.println(format.getFormattedString(a, b));
                } catch (IllegalArgumentException | ArithmeticException | MyException | IllegalAccessException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("------------------");
    }
}
