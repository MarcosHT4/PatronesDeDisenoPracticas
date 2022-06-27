package decorator.funcionalidadBancaria;

public class Client {

    public static void main(String[] args) {

        ICuenta cuentaBancaria = new CuentaBancaria(1000, "Dalas");
        cuentaBancaria = new BancaPorInternet(cuentaBancaria);
        cuentaBancaria = new Seguro(cuentaBancaria);
        cuentaBancaria = new Promocion(cuentaBancaria);

        cuentaBancaria.aplicarFuncionalidad();



    }

}
