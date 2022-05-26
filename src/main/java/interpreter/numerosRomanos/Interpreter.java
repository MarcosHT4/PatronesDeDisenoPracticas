package interpreter.numerosRomanos;

import java.util.ArrayList;
import java.util.List;

public class Interpreter extends ConversorNaturalARomano{

    private List<ConversorNaturalARomano> grammar = new ArrayList<>();
    private Context context;

    public Interpreter(String messageToInterpret) {

        context = new Context(messageToInterpret.replace(" ", ""));

        for(String charOriginal: messageToInterpret.split(" ")) {

            switch(charOriginal) {

                case "1":

                case "10":

                    grammar.add(new Uno(charOriginal.length()));
                    break;

                case "2":
                    grammar.add(new Dos(charOriginal.length()));
                    break;

                case "3":
                    grammar.add(new Tres(charOriginal.length()));
                    break;

                case "4":

                    grammar.add(new Cuatro(charOriginal.length()));
                    break;

                case "5":

                    grammar.add(new Cinco(charOriginal.length()));
                    break;

                case "6":

                    grammar.add(new Seis(charOriginal.length()));
                    break;

                case "7":

                    grammar.add(new Siete(charOriginal.length()));
                    break;

                case "8":

                    grammar.add(new Ocho(charOriginal.length()));
                    break;

                case "9":

                    grammar.add(new Nueve(charOriginal.length()));
                    break;
            }

        }

    }

    public String evaluateMsg() {

        for(ConversorNaturalARomano expression: grammar) {

            expression.interpreter(context);

        }

        return context.output;

    }

    @Override
    public void interpreter(Context context) {

    }
}
