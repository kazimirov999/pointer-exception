public enum MathActions {

    SUBTRACT, SUM, MULTYPLY, DIVIDE;

   static void showAll(){
        for (MathActions mA: MathActions.values()){
            System.out.println(mA.toString());
        }
    }
}
