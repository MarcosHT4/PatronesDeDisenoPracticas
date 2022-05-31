package iterator.importadorasAutomoviles;

public class AutomovilArray implements IColeccion {

    private Automovil[] autos;
    private int indice;

    public AutomovilArray() {

        autos = new Automovil[5];

    }

    public void add(Automovil automovil) {

        autos[indice] = automovil;
        indice++;

    }


    @Override
    public AutomovilArrayIterator createIterator() {

        return new AutomovilArrayIterator(autos);


    }
}
