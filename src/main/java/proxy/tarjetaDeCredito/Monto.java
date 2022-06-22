package proxy.tarjetaDeCredito;

public class Monto {

    private double cantidad;
    private TipoDeMoneda tipoDeMoneda;

    public Monto(double cantidad, TipoDeMoneda tipoDeMoneda) {
        this.cantidad = cantidad;
        this.tipoDeMoneda = tipoDeMoneda;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public TipoDeMoneda getTipoDeMoneda() {
        return tipoDeMoneda;
    }

    public void setTipoDeMoneda(TipoDeMoneda tipoDeMoneda) {
        this.tipoDeMoneda = tipoDeMoneda;
    }
}
