package bridge.empresasPaquetes;

public class Agua implements IEnvioPaquete{


    @Override
    public void enviarPaquete(Paquete paquete) {

        System.out.println("Enviando paquete por Agua!");
        System.out.println("El costo del paquete es de " + paquete.getPrecio() + " Bs.");
        System.out.println("Aplicando descuento del 50%...");
        paquete.setPrecio(paquete.getPrecio() + (paquete.getPrecio()*50)/100);
        System.out.println("El nuevo precio es de: " + paquete.getPrecio() + " Bs.");
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");


    }
}
