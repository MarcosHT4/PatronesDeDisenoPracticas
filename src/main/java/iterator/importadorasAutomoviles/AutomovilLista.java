package iterator.importadorasAutomoviles;

import java.util.ArrayList;
import java.util.List;

public class AutomovilLista implements IColeccion {

    private List<Automovil> autos;

    public AutomovilLista() {

        autos = new ArrayList<>();

    }

    public void add(Automovil automovil) {

        autos.add(automovil);

    }


    @Override
    public AutomovilListaIterator createIterator() {
        return new AutomovilListaIterator(autos);
    }
}
