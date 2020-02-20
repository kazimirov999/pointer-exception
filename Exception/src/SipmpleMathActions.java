enum SimpleMathActions {

    SUBTRACT, SUM, MULTYPLY, DIVIDE;

    static void showAllActions() {
        for (SimpleMathActions mA : SimpleMathActions.values()) {
            System.out.println(mA.toString());
        }
    }
}