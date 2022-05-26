package interpreter.numerosRomanos;

public class Client {

    public static void main(String[] args) {

        String mensaje1 = "1 2 3 4 5 6 7 8 9 10";
        String mensaje2 = "1 5";

        Interpreter parser1 = new Interpreter(mensaje1);

        System.out.println(parser1.evaluateMsg());

        Interpreter parser2 = new Interpreter(mensaje2);

        System.out.println(parser2.evaluateMsg());

    }

}
