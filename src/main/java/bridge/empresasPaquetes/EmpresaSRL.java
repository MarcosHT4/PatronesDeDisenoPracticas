package bridge.empresasPaquetes;

public class EmpresaSRL implements IEmpresa{


    private IEnvioPaquete envioPaquete;

    public EmpresaSRL(IEnvioPaquete envioPaquete) {
        this.envioPaquete = envioPaquete;
    }

    public IEnvioPaquete getEnvioPaquete() {
        return envioPaquete;
    }

    public void setEnvioPaquete(IEnvioPaquete envioPaquete) {
        this.envioPaquete = envioPaquete;
    }

    @Override
    public void infoEmpresa() {

        System.out.println("Empresa: ");
        System.out.println("SRL.");

    }

    @Override
    public void enviarPaquete(Paquete paquete) {

        this.envioPaquete.enviarPaquete(paquete);

    }
}
