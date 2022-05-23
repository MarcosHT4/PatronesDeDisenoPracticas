package abstractFactory.pasajes;

public class PasajeSolidario implements IPasaje {

    private int nroVuelo;
    private Pasajero pasajero;
    private int nroAsiento;
    private int costoPasaje;

    private int descuento;

    public PasajeSolidario() {}


    public int getNroVuelo() {
        return nroVuelo;
    }

    public void setNroVuelo(int nroVuelo) {
        this.nroVuelo = nroVuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public int getNroAsiento() {
        return nroAsiento;
    }

    public void setNroAsiento(int nroAsiento) {
        this.nroAsiento = nroAsiento;
    }

    public int getCostoPasaje() {
        return costoPasaje;
    }

    public void setCostoPasaje(int costoPasaje) {
        this.costoPasaje = costoPasaje;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public void showInfo() {

        System.out.println("Nro Vuelo: " + getNroVuelo());
        System.out.println("Nro Asiento: " + getNroAsiento());
        System.out.println("Pasajero Nombre: " + getPasajero().getNombre());
        System.out.println("Pasajero CI: " + getPasajero().getCi());
        System.out.println("Costo Pasaje: " + getCostoPasaje());
        System.out.println("Descuento: " + getDescuento());

    }
}
