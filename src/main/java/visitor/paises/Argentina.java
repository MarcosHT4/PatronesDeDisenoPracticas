package visitor.paises;

public class Argentina implements IPais{


    @Override
    public void visitadoPorLibreCambista(ILibreCambista libreCambista, EleccionDeCambio eleccionDeCambio) {

        libreCambista.visitarPais(this, eleccionDeCambio);

    }
}
