package factoryMethod.pasajes;

public class CreatePasajeStandart extends PasajeCreator {


    @Override
    public PasajeStandart createPasaje() {

        Destino destino = new Destino();
        destino.setAereopuerto("Viru Viru");
        destino.setCiudad("Santa Cruz");
        destino.setPais("Bolivia");

        Origen origen = new Origen();

        origen.setAereopuerto("Internacional El Alto");
        origen.setCiudad("El Alto");
        origen.setPais("Bolivia");

        Avion avion = new Avion();

        avion.setCapacidad(100);
        avion.setMarca("BOA");
        avion.setModelo("Boeing 777");
        avion.setNroDeAsientos(150);

        Pasajero pasajero = new Pasajero();

        pasajero.setNombre("Johnny");
        pasajero.setCi("6743112SCZ");



        PasajeStandart pasaje = new PasajeStandart();

        pasaje.setCostoPasaje(1200);
        pasaje.setAvion(avion);
        pasaje.setDestino(destino);
        pasaje.setOrigen(origen);
        pasaje.setNroAsiento(8);
        pasaje.setPasajero(pasajero);
        pasaje.setNroVuelo(988);

        return pasaje;


    }
}
