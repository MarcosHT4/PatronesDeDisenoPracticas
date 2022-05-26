package interpreter.numerosRomanos;

public class Cinco extends ConversorNaturalARomano {

    public Cinco(int digit) {

        this.digit = digit;

    }


    @Override
    public void interpreter(Context context) {

        if(context.input.startsWith("5")) {

            context.output = context.output+"V ";
            context.input = context.input.substring(this.digit);

        }


    }
}
