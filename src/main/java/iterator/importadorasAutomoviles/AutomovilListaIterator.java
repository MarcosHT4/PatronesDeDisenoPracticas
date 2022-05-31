package iterator.importadorasAutomoviles;

import java.util.List;

public class AutomovilListaIterator implements Iterator{

    private List<Automovil> autos;
    private int indice;

    public AutomovilListaIterator(List<Automovil> autos) {

        this.autos = autos;
        indice = 0;

    }


    @Override
    public Object next() {
        return autos.get(indice++);
    }

    @Override
    public boolean hasNext() {
        return autos.size() !=0 && indice < autos.size();
    }
}
