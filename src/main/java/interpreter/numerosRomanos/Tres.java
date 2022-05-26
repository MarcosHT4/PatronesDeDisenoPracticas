package interpreter.numerosRomanos;

public class Tres extends ConversorNaturalARomano {

    public Tres(int digit) {

        this.digit = digit;

    }


    @Override
    public void interpreter(Context context) {

        if(context.input.startsWith("3")) {

            context.output = context.output+"III ";
            context.input = context.input.substring(this.digit);

        }


    }
}
