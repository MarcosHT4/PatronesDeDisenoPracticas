package interpreter.numerosRomanos;

public class Siete extends ConversorNaturalARomano {

    public Siete(int digit) {

        this.digit = digit;

    }


    @Override
    public void interpreter(Context context) {

        if(context.input.startsWith("7")) {

            context.output = context.output+"VII ";
            context.input = context.input.substring(this.digit);

        }


    }
}
