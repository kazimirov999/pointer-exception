import java.util.Scanner;

public class Calculator {
    private Scanner scanner = new Scanner(System.in);

    public void startCalculator() {
        System.out.println("Primitive Calculator with error // v.1");
        System.out.println("------------------------");
        while (true) {
            System.out.println("Choice a method\n" +
                    "(1) if you need + \n" +
                    "(2) if you need - \n" +
                    "(3) if you need * \n" +
                    "(4) if you need / \n" +
                    "(5) exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Input first number, and second number");
                    try {
                        System.out.println("Result : " + Methods.sum(scanner.nextInt(), scanner.nextInt()));
                    } catch (IllegalArgumentException | ArithmeticException | IllegalAccessException | MyException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("------------------------");
                    break;
                case 2:
                    System.out.println("Input first number, and second number");
                    try {
                        System.out.println("Result : " + Methods.sub(scanner.nextInt(), scanner.nextInt()));
                    } catch (IllegalArgumentException | ArithmeticException | IllegalAccessException | MyException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("------------------------");
                    break;
                case 3:
                    System.out.println("Input first number, and second number");
                    try {
                        System.out.println("Result : " + Methods.mult(scanner.nextInt(), scanner.nextInt()));
                    } catch (IllegalArgumentException | ArithmeticException | IllegalAccessException | MyException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("------------------------");
                    break;
                case 4:
                    System.out.println("Input first number, and second number");
                    try {
                        System.out.println("Result : " + Methods.div(scanner.nextInt(), scanner.nextInt()));
                    } catch (IllegalArgumentException | ArithmeticException | IllegalAccessException | MyException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("------------------------");
                    break;
                case 5:
                    System.out.println("exit program...");
                    return;
                default:
                    System.out.println("error 1. 'default command, try again'");
            }
        }
    }

}
