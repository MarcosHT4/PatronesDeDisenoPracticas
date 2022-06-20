package visitor.paises;

public class Brasil implements IPais {



    @Override
    public void visitadoPorLibreCambista(ILibreCambista libreCambista, EleccionDeCambio eleccionDeCambio) {

        libreCambista.visitarPais(this, eleccionDeCambio);

    }

}
