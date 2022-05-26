package interpreter.numerosRomanos;

public class Ocho extends ConversorNaturalARomano {

    public Ocho(int digit) {

        this.digit = digit;

    }


    @Override
    public void interpreter(Context context) {

        if(context.input.startsWith("8")) {

            context.output = context.output+"VIII ";
            context.input = context.input.substring(this.digit);

        }


    }
}
