package iterator.importadorasAutomoviles;

public class AutomovilArrayIterator implements Iterator{

    private Automovil[] autos;
    private int indice;

    public AutomovilArrayIterator(Automovil[] autos) {

        this.autos = autos;
        indice = 0;

    }


    @Override
    public Object next() {

        return autos[indice++];

    }

    @Override
    public boolean hasNext() {
        return autos.length !=0 && indice < autos.length;
    }
}
