package interpreter.numerosRomanos;

public class Seis extends ConversorNaturalARomano {

    public Seis(int digit) {

        this.digit = digit;

    }


    @Override
    public void interpreter(Context context) {

        if(context.input.startsWith("6")) {

            context.output = context.output+"VI ";
            context.input = context.input.substring(this.digit);

        }


    }
}
