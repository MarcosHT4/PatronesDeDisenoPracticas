package proxy.tarjetaDeCredito;

public class TarjetaDeCredito implements ICuentaBancaria{

    private CuentaBancaria cuentaBancaria;

    public TarjetaDeCredito(String bancoOrigen, String tipoCuenta, int montoDeLaCuenta) {
        cuentaBancaria = new CuentaBancaria(bancoOrigen, tipoCuenta, montoDeLaCuenta);
    }



    @Override
    public void realizarPago(Monto monto) {

        if(monto.getTipoDeMoneda().getClass().getName().contains("MonedaBoliviano")) {

            if(cuentaBancaria.getMonto() >= monto.getCantidad()) {

                cuentaBancaria.realizarPago(monto);

            } else {

                System.out.println("ERROR! La cuenta bancaria no cuenta con el suficiente saldo" );
                System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

            }

        } else {

            System.out.println("El monto a cobrar no está en Bolivianos, conviertiendo...");



            Monto nuevoMonto = new Monto(monto.getCantidad()*monto.getTipoDeMoneda().getFactorDeConversionABolivianos(), new MonedaBoliviano());

            System.out.println("El monto convertido a Bolivianos a equivale a " + nuevoMonto.getCantidad());

            if(cuentaBancaria.getMonto() >= nuevoMonto.getCantidad()) {

                cuentaBancaria.realizarPago(nuevoMonto);

            } else {

                System.out.println("ERROR! La cuenta bancaria no cuenta con el suficiente saldo" );
                System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

            }



        }


    }
}
