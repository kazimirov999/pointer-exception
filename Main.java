import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a command from the list:");
        MathActions.showAll();

        String command = in.nextLine().toUpperCase();


        if (MathActions.valueOf(command).equals(MathActions.SUBTRACT)) {
            System.out.println("Enter two numbers");
            double numberA = in.nextDouble();
            double numberB = in.nextDouble();
            try {
                MyMethods.subtract(numberA, numberB);
            } catch (IllegalArgumentException|ArithmeticException|MyMethods.MyExeption e) {
                System.out.println(e.getMessage());
            }
        } else if (MathActions.valueOf(command) == MathActions.SUM) {
            System.out.println("Enter two numbers");
            double numberA = in.nextDouble();
            double numberB = in.nextDouble();
            try {
                MyMethods.sum(numberA, numberB);
            } catch (IllegalArgumentException|ArithmeticException|MyMethods.MyExeption e) {
                System.out.println(e.getMessage());
            }

        } else if (MathActions.valueOf(command).equals(MathActions.MULTYPLY)) {
            System.out.println("Enter two numbers");
            double numberA = in.nextDouble();
            double numberB = in.nextDouble();
            try {
                MyMethods.multyply(numberA, numberB);
            } catch (IllegalArgumentException|ArithmeticException|MyMethods.MyExeption e) {
                System.out.println(e.getMessage());
            }

        } else if (MathActions.valueOf(command).equals(MathActions.DIVIDE)) {
            System.out.println("Enter two numbers");
            double numberA = in.nextDouble();
            double numberB = in.nextDouble();
            try {
                MyMethods.divide(numberA, numberB);
            } catch (IllegalArgumentException|ArithmeticException|MyMethods.MyExeption e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("No such command");
        }


    }

}
