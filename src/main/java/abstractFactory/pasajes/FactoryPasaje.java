package abstractFactory.pasajes;

public class FactoryPasaje {

    enum Pasajes {

        PasajeStandard, PasajeSolidario, PasajeInfantes

    }

    public static IPasaje make(Pasajes p) {

        IPasaje pasaje;


        switch(p) {

            case PasajeStandard:
                pasaje = new PasajeStandard();

                Pasajero pasajero = new Pasajero();

                pasajero.setNombre("Carlos");
                pasajero.setCi("58487347");

                ((PasajeStandard) pasaje).setNroVuelo(20);
                ((PasajeStandard) pasaje).setPasajero(pasajero);
                ((PasajeStandard) pasaje).setNroAsiento(4);
                ((PasajeStandard) pasaje).setCostoPasaje(699);
                break;


            case PasajeSolidario:

                pasaje = new PasajeSolidario();

                Pasajero pasajero1 = new Pasajero();

                pasajero1.setNombre("Pepe");
                pasajero1.setCi("43534");

                ((PasajeSolidario) pasaje).setNroVuelo(20);
                ((PasajeSolidario) pasaje).setPasajero(pasajero1);
                ((PasajeSolidario) pasaje).setNroAsiento(4);
                ((PasajeSolidario) pasaje).setCostoPasaje(699);
                ((PasajeSolidario) pasaje).setDescuento(500);

                break;

            case PasajeInfantes:

                pasaje = new PasajeInfantes();
                PasajeroEspecial pasajero2 = new PasajeroEspecial();
                pasajero2.setNombre("John");
                pasajero2.setCi("564565");
                pasajero2.setFechaDeNacimiento("21/09/2019");
                ((PasajeInfantes) pasaje).setNroVuelo(20);
                ((PasajeInfantes) pasaje).setPasajero(pasajero2);
                ((PasajeInfantes) pasaje).setNroAsiento(4);
                ((PasajeInfantes) pasaje).setCostoEspecial(699);

                break;

            default:

                pasaje = null;

        }

        return pasaje;




    }

}
