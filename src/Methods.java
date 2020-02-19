public class Methods {

    public static int sum(int numFirst, int numSecond) throws IllegalAccessException, MyException {
        if (numFirst < 0 && numSecond < 0) {
            throw new IllegalArgumentException("Error! Number First and Number Second < 0");
        }
        if (numFirst == 0 && numSecond != 0) {
            throw new ArithmeticException("Error! Number First = 0 and Number Second != 0");
        }
        if (numFirst != 0 && numSecond == 0) {
            throw new ArithmeticException("Error! Number First != 0 and Number Second = 0");
        }
        if (numFirst == 0 && numSecond == 0) {
            throw new IllegalAccessException("Error! Number First = 0 and Number Second = 0");
        }
        if (numFirst > 0 && numSecond > 0) {
            throw new MyException("Error! Number First > 0 and Number Second > 0");
        }
        return numFirst + numSecond;
    }

    public static double sub(int numFirst, int numSecond) throws IllegalAccessException, MyException {
        if (numFirst < 0 && numSecond < 0) {
            throw new IllegalArgumentException("Error! Number First and Number Second < 0");
        }
        if (numFirst == 0 && numSecond != 0) {
            throw new ArithmeticException("Error! Number First = 0 and Number Second != 0");
        }
        if (numFirst != 0 && numSecond == 0) {
            throw new ArithmeticException("Error! Number First != 0 and Number Second = 0");
        }
        if (numFirst == 0 && numSecond == 0) {
            throw new IllegalAccessException("AError! Number First = 0 and Number Second = 0");
        }
        if (numFirst > 0 && numSecond > 0) {
            throw new MyException("Error! Number First > 0 and Number Second > 0");
        }
        return numFirst - numSecond;
    }

    public static int mult(int numFirst, int numSecond) throws IllegalAccessException, MyException {
        if (numFirst < 0 && numSecond < 0) {
            throw new IllegalArgumentException("Error! Number First and Number Second < 0");
        }
        if (numFirst == 0 && numSecond != 0) {
            throw new ArithmeticException("Error! Number First = 0 and Number Second != 0");
        }
        if (numFirst != 0 && numSecond == 0) {
            throw new ArithmeticException("Error! Number First != 0 and Number Second = 0");
        }
        if (numFirst == 0 && numSecond == 0) {
            throw new IllegalAccessException("AError! Number First = 0 and Number Second = 0");
        }
        if (numFirst > 0 && numSecond > 0) {
            throw new MyException("Error! Number First > 0 and Number Second > 0");
        }
        return numFirst * numSecond;
    }

    public static double div(int numFirst, int numSecond) throws IllegalAccessException, MyException {
        if (numFirst < 0 && numSecond < 0) {
            throw new IllegalArgumentException("Error! Number First and Number Second < 0");
        }
        if (numFirst == 0 && numSecond != 0) {
            throw new ArithmeticException("Error! Number First = 0 and Number Second != 0");
        }
        if (numFirst != 0 && numSecond == 0) {
            throw new ArithmeticException("Error! Number First != 0 and Number Second = 0");
        }
        if (numFirst == 0 && numSecond == 0) {
            throw new IllegalAccessException("AError! Number First = 0 and Number Second = 0");
        }
        if (numFirst > 0 && numSecond > 0) {
            throw new MyException("Error! Number First > 0 and Number Second > 0");
        }
        return numFirst / numSecond;
    }

}
