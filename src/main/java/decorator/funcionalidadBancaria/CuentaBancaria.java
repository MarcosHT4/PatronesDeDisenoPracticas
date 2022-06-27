package decorator.funcionalidadBancaria;

public class CuentaBancaria implements ICuenta {

    private int monto;
    private String nombrePropietario;

    private boolean pagoPorInternet;

    public CuentaBancaria(int monto, String nombrePropietario) {
        this.monto = monto;
        this.nombrePropietario = nombrePropietario;
        pagoPorInternet = false;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public boolean isPagoPorInternet() {
        return pagoPorInternet;
    }

    public void setPagoPorInternet(boolean pagoPorInternet) {
        this.pagoPorInternet = pagoPorInternet;
    }

    @Override
    public void aplicarFuncionalidad() {

        System.out.println("Aplicando funcionalidad a la cuenta bancaria!");
        System.out.println("Datos actuales de la cuenta: ");
        System.out.println("Nombre del propietario: " + nombrePropietario);
        System.out.println("Monto de la cuenta: " + monto);
        System.out.println("Se puede pagar por internet? " + pagoPorInternet);

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");


    }
}
