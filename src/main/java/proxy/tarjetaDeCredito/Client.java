package proxy.tarjetaDeCredito;

public class Client {

    public static void main(String[] args) {

        ICuentaBancaria tarjetaDeCredito = new TarjetaDeCredito("BNB", "Caja de Ahorros", 1000);

        tarjetaDeCredito.realizarPago(new Monto(700, new MonedaBoliviano()));

        tarjetaDeCredito.realizarPago(new Monto(20, new MonedaDolar()));

        tarjetaDeCredito.realizarPago(new Monto(100, new MonedaEuro()));


    }

}
