package decorator.funcionalidadBancaria;

public interface ICuenta {

    String getNombrePropietario();
    void aplicarFuncionalidad();

    int getMonto();

    void setMonto(int monto);

    boolean isPagoPorInternet();

    void setPagoPorInternet(boolean pagoPorInternet);

}
