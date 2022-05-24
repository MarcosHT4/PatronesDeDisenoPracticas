package factoryMethod.pasajes;

public class Client {

    public static void main(String [] args) {

        PasajeStandart pasajeStandart1 = new CreatePasajeStandart().createPasaje();
        PasajeSolidario pasajeSolidario1 = new CreatePasajeSolidario().createPasaje();
        PasajeInfantes pasajeInfantes1 = new CreatePasajeInfantes().createPasaje();

        PasajeStandart pasajeStandart2 = new CreatePasajeStandart().createPasaje();
        PasajeSolidario pasajeSolidario2 = new CreatePasajeSolidario().createPasaje();
        PasajeInfantes pasajeInfantes2 = new CreatePasajeInfantes().createPasaje();

        Pasajero pasajero1 = new Pasajero();

        pasajero1.setCi("4874987LP");
        pasajero1.setNombre("Dalas");

        pasajeStandart2.setPasajero(pasajero1);
        pasajeStandart2.setNroAsiento(4);

        Pasajero pasajero2 = new Pasajero();

        pasajero2.setCi("547648796SCZ");
        pasajero2.setNombre("Wismichu");

        pasajeSolidario2.setPasajero(pasajero2);
        pasajeSolidario2.setNroAsiento(7);

        PasajeroEspecial pasajero3 = new PasajeroEspecial();

        pasajero3.setNombre("Javi");
        pasajero3.setCi("42358989CBBA");
        pasajero3.setFechaNacimiento("4/09/2018");

        pasajeInfantes2.setPasajero(pasajero3);
        pasajeInfantes2.setNroAsiento(22);

        pasajeStandart1.showInfo();
        pasajeStandart2.showInfo();
        pasajeSolidario1.showInfo();
        pasajeSolidario2.showInfo();
        pasajeInfantes1.showInfo();
        pasajeInfantes2.showInfo();





    }

}
