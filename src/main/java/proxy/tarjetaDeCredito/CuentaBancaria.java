package proxy.tarjetaDeCredito;

public class CuentaBancaria implements ICuentaBancaria {

    private String bancoOrigen;
    private String tipoCuenta;
    private int monto;

    public CuentaBancaria(String bancoOrigen, String tipoCuenta, int monto) {
        this.bancoOrigen = bancoOrigen;
        this.tipoCuenta = tipoCuenta;
        this.monto = monto;
    }

    public String getBancoOrigen() {
        return bancoOrigen;
    }

    public void setBancoOrigen(String bancoOrigen) {
        this.bancoOrigen = bancoOrigen;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override

    public void realizarPago(Monto monto) {

        System.out.println("Descontando " + monto.getCantidad() + "Bs. " + " de la cuenta bancaria");
        this.monto -= monto.getCantidad();
        System.out.println("Quedan " + this.monto + "Bs." + " en la cuenta");
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

    }

}
