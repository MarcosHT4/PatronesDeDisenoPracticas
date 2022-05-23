package abstractFactory.pasajes;

public class Client {

    public static void main(String[] args) {

        IPasaje pasaje = FactoryPasaje.make(FactoryPasaje.Pasajes.PasajeSolidario);

        pasaje.showInfo();



    }

}
