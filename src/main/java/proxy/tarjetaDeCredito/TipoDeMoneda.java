package proxy.tarjetaDeCredito;

public abstract class TipoDeMoneda {

    private String moneda;
    private double factorDeConversionABolivianos;

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getFactorDeConversionABolivianos() {
        return factorDeConversionABolivianos;
    }

    public void setFactorDeConversionABolivianos(double factorDeConversionABolivianos) {
        this.factorDeConversionABolivianos = factorDeConversionABolivianos;
    }
}
