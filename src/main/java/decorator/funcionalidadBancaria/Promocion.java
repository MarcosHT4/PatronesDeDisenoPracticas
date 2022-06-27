package decorator.funcionalidadBancaria;

import java.util.Random;

public class Promocion extends FuncionalidadCuenta {


    public Promocion(ICuenta cuentaBase) {
        super(cuentaBase);
    }

    @Override

    public void aplicarFuncionalidad() {

        super.aplicarFuncionalidad();

        System.out.println("Aplicando la funcionalidad de la promocion!");

        System.out.println("Se le sorteará un número para ver si gana la promoción!");
        int r = new Random().nextInt(100);

        System.out.println("El numero es: " + r + "!");


        if(r%2 == 0) {

            System.out.println("Felicidades! Usted es el ganador!");
            System.out.println("Procedermos a duplicar su monto");
            setMonto(getMonto()*2);
            System.out.println("Nuevo status: ");
            System.out.println("Nombre del propietario: " + getNombrePropietario());
            System.out.println("Monto: " + getMonto());
            System.out.println("Se puede pagar por internet? " + isPagoPorInternet());


        } else {

            System.out.println("Mala suerte! Buena suerte en la proxima!");

        }

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");






    }

}
