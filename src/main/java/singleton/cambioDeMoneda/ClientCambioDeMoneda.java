package singleton.cambioDeMoneda;

public class ClientCambioDeMoneda {

    public static void main(String[] args) {

        Banco banco1 = new Banco("BCP");
        Banco banco2 = new Banco("BNB");

        CasaDeCambio casa1 = new CasaDeCambio("MIBA SRL");
        CasaDeCambio casa2 = new CasaDeCambio("SANDANEL");

        LibreCambista libre1 = new LibreCambista("Pepe");
        LibreCambista libre2 = new LibreCambista("Paco");

        banco1.cambiarBolivianosADolares(543);
        banco2.cambiarDolaresABolivianos(58);
        casa1.cambiarBolivianosAEuros(2334);
        casa2.cambiarEurosABolivianos(76);
        libre1.cambiarDolaresAEuros(44);
        libre2.cambiarEurosADolares(243);



    }

}
