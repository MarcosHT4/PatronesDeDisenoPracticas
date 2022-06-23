package bridge.empresasPaquetes;

public class Tierra implements IEnvioPaquete{


    @Override
    public void enviarPaquete(Paquete paquete) {

        System.out.println("Enviando paquete por Tierra!");
        System.out.println("El costo del paquete es de " + paquete.getPrecio() + " Bs.");
        System.out.println("Aplicando descuento del 5%...");
        paquete.setPrecio(paquete.getPrecio() + (paquete.getPrecio()*5)/100);
        System.out.println("El nuevo precio es de: " + paquete.getPrecio() + " Bs.");
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

    }
}
