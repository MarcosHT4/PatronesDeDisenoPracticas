package decorator.funcionalidadBancaria;

public abstract class FuncionalidadCuenta implements ICuenta {

    private ICuenta cuentaBase;

    public FuncionalidadCuenta(ICuenta cuentaBase) {
        this.cuentaBase = cuentaBase;
    }

    @Override
    public int getMonto() {
        return cuentaBase.getMonto();
    }

    @Override
    public void setMonto(int monto) {
        cuentaBase.setMonto(monto);
    }

    @Override
    public boolean isPagoPorInternet() {
        return cuentaBase.isPagoPorInternet();
    }

    @Override

    public String getNombrePropietario() {

        return cuentaBase.getNombrePropietario();

    }

    @Override
    public void setPagoPorInternet(boolean pagoPorInternet) {

        cuentaBase.setPagoPorInternet(pagoPorInternet);

    }

    @Override
    public void aplicarFuncionalidad() {

        cuentaBase.aplicarFuncionalidad();

    }
}
