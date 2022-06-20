package adapter.artefactosElectronicos;

public class AdaptadorArtefactosAdquiridos implements IArtefactosOriginal {

    private IArtefactosAdquiridos artefactosAdquiridos;

    public AdaptadorArtefactosAdquiridos(IArtefactosAdquiridos artefactosAdquiridos) {
        this.artefactosAdquiridos = artefactosAdquiridos;
    }

    public IArtefactosAdquiridos getArtefactosAdquiridos() {
        return artefactosAdquiridos;
    }

    public void setArtefactosAdquiridos(IArtefactosAdquiridos artefactosAdquiridos) {
        this.artefactosAdquiridos = artefactosAdquiridos;
    }

    @Override
    public void precio() {

        artefactosAdquiridos.costo();

    }

    @Override
    public void tiempoDeVida() {

        artefactosAdquiridos.tiempoDeGarantia();

    }
}
