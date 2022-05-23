package abstractFactory.pasajes;

public class PasajeInfantes implements IPasaje {

    private int nroVuelo;
    private PasajeroEspecial pasajero;
    private int nroAsiento;
    private int costoEspecial;


    public PasajeInfantes() {}

    public int getNroVuelo() {
        return nroVuelo;
    }

    public void setNroVuelo(int nroVuelo) {
        this.nroVuelo = nroVuelo;
    }

    public PasajeroEspecial getPasajero() {
        return pasajero;
    }

    public void setPasajero(PasajeroEspecial pasajero) {
        this.pasajero = pasajero;
    }

    public int getNroAsiento() {
        return nroAsiento;
    }

    public void setNroAsiento(int nroAsiento) {
        this.nroAsiento = nroAsiento;
    }

    public int getCostoEspecial() {
        return costoEspecial;
    }

    public void setCostoEspecial(int costoEspecial) {
        this.costoEspecial = costoEspecial;
    }


    @Override
    public void showInfo() {

        System.out.println("Nro Vuelo: " + getNroVuelo());
        System.out.println("Nro Asiento: " + getNroAsiento());
        System.out.println("Pasajero Nombre: " + getPasajero().getNombre());
        System.out.println("Pasajero CI: " + getPasajero().getCi());
        System.out.println("Pasajero Fecha Nac.: " + getPasajero().getFechaDeNacimiento());
        System.out.println("Costo Especial: " + getCostoEspecial());

    }
}
