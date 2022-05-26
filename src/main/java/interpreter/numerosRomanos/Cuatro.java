package interpreter.numerosRomanos;

public class Cuatro extends ConversorNaturalARomano {

    public Cuatro(int digit) {

        this.digit = digit;

    }


    @Override
    public void interpreter(Context context) {

        if(context.input.startsWith("4")) {

            context.output = context.output+"IV ";
            context.input = context.input.substring(this.digit);

        }


    }
}
