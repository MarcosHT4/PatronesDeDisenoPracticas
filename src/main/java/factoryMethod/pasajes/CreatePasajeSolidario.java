package factoryMethod.pasajes;

public class CreatePasajeSolidario extends PasajeCreator {

    @Override
    public PasajeSolidario createPasaje() {

        Destino destino = new Destino();
        destino.setAereopuerto("Apolo");
        destino.setCiudad("La Paz");
        destino.setPais("Bolivia");

        Origen origen = new Origen();

        origen.setAereopuerto("Copacabana");
        origen.setCiudad("Copacabana");
        origen.setPais("Bolivia");

        Avion avion = new Avion();

        avion.setCapacidad(100);
        avion.setMarca("BOA");
        avion.setModelo("Boeing 777");
        avion.setNroDeAsientos(150);

        Pasajero pasajero = new Pasajero();

        pasajero.setNombre("Uriel");
        pasajero.setCi("3453354LP");



        PasajeSolidario pasaje = new PasajeSolidario();

        pasaje.setCostoPasaje(1200);
        pasaje.setAvion(avion);
        pasaje.setDestino(destino);
        pasaje.setOrigen(origen);
        pasaje.setNroAsiento(8);
        pasaje.setPasajero(pasajero);
        pasaje.setNroVuelo(988);
        pasaje.setDescuento(600);
        pasaje.setMotivoDelDescuento("Vuelo perdido");



        return pasaje;


    }



}
