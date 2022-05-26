package interpreter.numerosRomanos;

public class Dos extends ConversorNaturalARomano {

    public Dos(int digit) {

        this.digit = digit;

    }


    @Override
    public void interpreter(Context context) {

        if(context.input.startsWith("2")) {

            context.output = context.output+"II ";
            context.input = context.input.substring(this.digit);

        }


    }
}
