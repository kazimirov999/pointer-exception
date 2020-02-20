
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a command from the list:");
        SimpleMathActions.showAllActions();

        String command = in.nextLine().toUpperCase();


        if (SimpleMathActions.valueOf(command).equals(SimpleMathActions.SUBTRACT)) {
            System.out.println("Enter a and b numbers");
            double numberA = in.nextDouble();
            double numberB = in.nextDouble();
            try {
                Methods.subtract(numberA, numberB);
            } catch (IllegalArgumentException | ArithmeticException | Methods.MyExeption e) {
                System.out.println(e.getMessage());
            }
        } else if (SimpleMathActions.valueOf(command) == SimpleMathActions.SUM) {
            System.out.println("Enter a and b numbers");
            double numberA = in.nextDouble();
            double numberB = in.nextDouble();
            try {
                Methods.sum(numberA, numberB);
            } catch (IllegalArgumentException | ArithmeticException | Methods.MyExeption e) {
                System.out.println(e.getMessage());
            }

        } else if (SimpleMathActions.valueOf(command).equals(SimpleMathActions.MULTYPLY)) {
            System.out.println("Enter a and b numbers");
            double numberA = in.nextDouble();
            double numberB = in.nextDouble();
            try {
                Methods.multyply(numberA, numberB);
            } catch (IllegalArgumentException | ArithmeticException | Methods.MyExeption e) {
                System.out.println(e.getMessage());
            }

        } else if (SimpleMathActions.valueOf(command).equals(SimpleMathActions.DIVIDE)) {
            System.out.println("Enter a and b numbers");
            double numberA = in.nextDouble();
            double numberB = in.nextDouble();
            try {
                Methods.divide(numberA, numberB);
            } catch (IllegalArgumentException | ArithmeticException | Methods.MyExeption e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("No command");
        }


    }

}

