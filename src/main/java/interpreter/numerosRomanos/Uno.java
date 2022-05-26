package interpreter.numerosRomanos;

public class Uno extends ConversorNaturalARomano {

    public Uno(int digit) {

        this.digit = digit;

    }


    @Override
    public void interpreter(Context context) {

        if(context.input.startsWith("1") && context.input.substring(1).startsWith("0")) {

            context.output = context.output+"X ";
            context.input = context.input.substring(this.digit);

        } else if(context.input.startsWith("1")) {

            context.output = context.output+"I ";
            context.input = context.input.substring(this.digit);

        }


    }
}
