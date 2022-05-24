package factoryMethod.pasajes;

public class CreatePasajeInfantes extends PasajeCreator {

    @Override

    public PasajeInfantes createPasaje() {

        Destino destino = new Destino();
        destino.setAereopuerto("Magdalena");
        destino.setCiudad("Guayamerin");
        destino.setPais("Bolivia");

        Origen origen = new Origen();

        origen.setAereopuerto("Monteagudo");
        origen.setCiudad("Sucre");
        origen.setPais("Bolivia");

        Avion avion = new Avion();

        avion.setCapacidad(100);
        avion.setMarca("AmasZonas");
        avion.setModelo("Boeing 737");
        avion.setNroDeAsientos(150);

        PasajeroEspecial pasajero = new PasajeroEspecial();

        pasajero.setNombre("Yoshi");
        pasajero.setCi("65674746CBBA");
        pasajero.setFechaNacimiento("21/05/2020");



        PasajeInfantes pasaje = new PasajeInfantes();

        pasaje.setAvion(avion);
        pasaje.setDestino(destino);
        pasaje.setOrigen(origen);
        pasaje.setNroAsiento(8);
        pasaje.setPasajero(pasajero);
        pasaje.setNroVuelo(988);
        pasaje.setCostoEspecial(500);

        return pasaje;




    }

}
