package decorator.funcionalidadBancaria;

public class BancaPorInternet extends FuncionalidadCuenta {


    public BancaPorInternet(ICuenta cuentaBase) {
        super(cuentaBase);
    }

    @Override

    public void aplicarFuncionalidad() {

        super.aplicarFuncionalidad();

        System.out.println("Aplicando la funcionalidad de banca por Internet!");

        setPagoPorInternet(true);

        System.out.println("Nuevo status: ");
        System.out.println("Nombre del propietario: " + getNombrePropietario());
        System.out.println("Monto: " + getMonto());
        System.out.println("Se puede pagar por internet? " + isPagoPorInternet());
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");


    }

}
