public class Main {

    public static void main(String[] args){
        try{
            Methods.subtract(0, 0);
        }catch (IllegalArgumentException | ArithmeticException | IllegalAccessException | MyException e){
            System.out.println(e.getMessage());
        }
        try{
            Methods.divide(0, 2);
        }catch (IllegalArgumentException | ArithmeticException | IllegalAccessException | MyException e){
            System.out.println(e.getMessage());
        }
        try{
            Methods.multiply(2, 2);
        }catch (IllegalArgumentException | ArithmeticException | IllegalAccessException | MyException e){
            System.out.println(e.getMessage());
        }
        try{
            Methods.summate(1, 0);
        }catch (IllegalArgumentException | ArithmeticException | IllegalAccessException | MyException e){
            System.out.println(e.getMessage());
        }
        try{
            Methods.subtract(-1, -3);
        }catch (IllegalArgumentException | ArithmeticException | IllegalAccessException | MyException e){
            System.out.println(e.getMessage());
        }
    }
}
