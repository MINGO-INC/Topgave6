public class Methods {


    public void methodA(String input) {
        System.out.println("J");
        if (!input.equals("start")) {
            System.out.println("b");
            methodB("start");
        } else {
            System.out.println("a");
            methodC(input);
        }
        System.out.println("\n");
        System.out.println("S");
        System.out.println("j");
        methodE(input);
    }

    public void methodB(String start) {
        System.out.println("t");
    }

    public void methodC(String input) {
        System.out.println("v");
        methodD("r");
    }

    public void methodD(String i) {
        System.out.println("a");
        if (i.equals("r")) {
            System.out.println("\n");
            System.out.println("e");
        }
        System.out.println("r");
    }

    public void methodE(String input) {
        System.out.println("o");
        //methodC("start");
        methodR();
    }
    public void methodR(){
        System.out.println("v");
        System.out.println("t");
    }
}