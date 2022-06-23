package bridge.empresasPaquetes;

public interface IEmpresa {

    void infoEmpresa();
    void enviarPaquete(Paquete paquete);
    void setEnvioPaquete(IEnvioPaquete envioPaquete);

}
