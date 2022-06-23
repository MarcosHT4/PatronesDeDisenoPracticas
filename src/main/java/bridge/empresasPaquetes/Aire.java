package bridge.empresasPaquetes;

public class Aire implements IEnvioPaquete{


    @Override
    public void enviarPaquete(Paquete paquete) {

        System.out.println("Enviando paquete por Aire!");
        System.out.println("El costo del paquete es de " + paquete.getPrecio() + " Bs.");
        System.out.println("Aplicando descuento del 10%...");
        paquete.setPrecio(paquete.getPrecio() + (paquete.getPrecio()*10)/100);
        System.out.println("El nuevo precio es de: " + paquete.getPrecio() + " Bs.");
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");


    }
}
