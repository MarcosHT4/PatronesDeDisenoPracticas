package decorator.funcionalidadBancaria;

public class Seguro extends FuncionalidadCuenta {


    public Seguro(ICuenta cuentaBase) {
        super(cuentaBase);
    }

    @Override

    public void aplicarFuncionalidad() {

        super.aplicarFuncionalidad();

        System.out.println("Aplicando la funcionalidad de seguro!");
        System.out.println("El costo del seguro es de 100 Bs.!");


        if(getMonto() >= 100) {

            System.out.println("Procederemos a cobrarle el seguro!");
            setMonto(getMonto()-100);
            System.out.println("Nuevo status: ");
            System.out.println("Nombre del propietario: " + getNombrePropietario());
            System.out.println("Monto: " + getMonto());
            System.out.println("Se puede pagar por internet? " + isPagoPorInternet());


        } else {

            System.out.println("Lamentablemente, no tiene el suficiente dinero en su cuenta para pagar el seguro");

        }

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");






    }

}
