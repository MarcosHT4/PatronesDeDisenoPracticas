package bridge.empresasPaquetes;

public class EmpresaSA implements IEmpresa{


    private IEnvioPaquete envioPaquete;

    public EmpresaSA(IEnvioPaquete envioPaquete) {
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
        System.out.println("S.A");

    }

    @Override
    public void enviarPaquete(Paquete paquete) {

        this.envioPaquete.enviarPaquete(paquete);

    }
}
