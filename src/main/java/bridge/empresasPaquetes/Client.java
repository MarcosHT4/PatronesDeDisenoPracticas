package bridge.empresasPaquetes;

public class Client {

    public static void main(String[] args) {

        IEnvioPaquete envioPorAire = new Aire();
        IEnvioPaquete envioPorTierra = new Tierra();
        Paquete paquete = new Paquete("Paquete01", "Nintendo Switch", 350);
        Paquete paquete1 = new Paquete("Paquete02", "PlayStation 5", 400);

        IEmpresa empresaSa = new EmpresaSA(envioPorAire);
        IEmpresa empresaSrl = new EmpresaSRL(envioPorTierra);

        empresaSa.enviarPaquete(paquete);
        empresaSrl.enviarPaquete(paquete1);

        IEnvioPaquete envioPorAgua = new Agua();
        Paquete paquete2 = new Paquete("Paquete03", "aiFon 9", 3000);



        empresaSa.setEnvioPaquete(envioPorAgua);
        empresaSa.enviarPaquete(paquete2);




    }

}
