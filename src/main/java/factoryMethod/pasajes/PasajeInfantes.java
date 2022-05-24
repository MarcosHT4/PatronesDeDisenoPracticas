package factoryMethod.pasajes;

public class PasajeInfantes implements IPasaje {

    private int nroVuelo;
    private Destino destino;
    private Origen origen;
    private Avion avion;
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

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Origen getOrigen() {
        return origen;
    }

    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
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

        System.out.println("Pasaje Infantes: ");
        System.out.println("Nro Vuelo: " + nroVuelo);
        System.out.println("Destino Pais: " + destino.getPais());
        System.out.println("Destino Ciudad: " + destino.getCiudad());
        System.out.println("Destino Aereopuerto: " + destino.getAereopuerto());
        System.out.println("Origen Pais: " + origen.getPais());
        System.out.println("Origen Ciudad: " + origen.getCiudad());
        System.out.println("Origen Aereopuerto: " + origen.getAereopuerto());
        System.out.println("Avion Marca: " + avion.getMarca());
        System.out.println("Avion Capacidad: " + avion.getCapacidad());
        System.out.println("Avion Modelo: " + avion.getModelo());
        System.out.println("Avion NroAsientos: " + avion.getNroDeAsientos());
        System.out.println("Pasajero Nombre: " + pasajero.getNombre());
        System.out.println("Pasajero C.I: " + pasajero.getCi());
        System.out.println("Pasajero Fecha Nacimiento: " + pasajero.getFechaNacimiento());
        System.out.println("NroAsiento: " + nroAsiento);
        System.out.println("Costo de pasaje especial: " + costoEspecial);
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");

    }

}
