package interpreter.numerosRomanos;

public class Nueve extends ConversorNaturalARomano {

    public Nueve(int digit) {

        this.digit = digit;

    }


    @Override
    public void interpreter(Context context) {

        if(context.input.startsWith("9")) {

            context.output = context.output+"IX ";
            context.input = context.input.substring(this.digit);

        }


    }
}