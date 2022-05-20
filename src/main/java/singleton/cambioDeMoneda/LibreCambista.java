package singleton.cambioDeMoneda;

public class LibreCambista {

    private String nombre;

    public LibreCambista(String nombre) {

        this.nombre = nombre;

    }

    public void cambiarBolivianosADolares(double cantidad) {

        double nuevaCantidad = EmpresaCambioDeMoneda.getInstance().realizarCambio("Boliviano", "Dolar", cantidad);
        String[] extractos = EmpresaCambioDeMoneda.getInstance().imprimirExtracto("Libre Cambio", nombre, "Bs.", "$", cantidad, nuevaCantidad);
        System.out.println(extractos[0]);
        System.out.println(extractos[1]);
    }

    public void cambiarDolaresABolivianos(double cantidad) {

        double nuevaCantidad = EmpresaCambioDeMoneda.getInstance().realizarCambio("Dolar", "Boliviano", cantidad);
        String[] extractos = EmpresaCambioDeMoneda.getInstance().imprimirExtracto("Libre Cambio", nombre, "$", "Bs.", cantidad, nuevaCantidad);
        System.out.println(extractos[0]);
        System.out.println(extractos[1]);


    }

    public void cambiarBolivianosAEuros(double cantidad) {

        double nuevaCantidad = EmpresaCambioDeMoneda.getInstance().realizarCambio("Boliviano", "Euro", cantidad);
        String[] extractos = EmpresaCambioDeMoneda.getInstance().imprimirExtracto("Libre Cambio", nombre, "Bs.", "€", cantidad, nuevaCantidad);
        System.out.println(extractos[0]);
        System.out.println(extractos[1]);

    }

    public void cambiarEurosABolivianos(double cantidad) {

        double nuevaCantidad = EmpresaCambioDeMoneda.getInstance().realizarCambio("Euro", "Boliviano", cantidad);
        String[] extractos = EmpresaCambioDeMoneda.getInstance().imprimirExtracto("Libre Cambio", nombre, "€", "Bs.", cantidad, nuevaCantidad);
        System.out.println(extractos[0]);
        System.out.println(extractos[1]);


    }

    public void cambiarDolaresAEuros(double cantidad) {

        double nuevaCantidad = EmpresaCambioDeMoneda.getInstance().realizarCambio("Dolar", "Euro", cantidad);
        String[] extractos = EmpresaCambioDeMoneda.getInstance().imprimirExtracto("Libre Cambio", nombre, "$", "€", cantidad, nuevaCantidad);
        System.out.println(extractos[0]);
        System.out.println(extractos[1]);

    }

    public void cambiarEurosADolares(double cantidad) {

        double nuevaCantidad = EmpresaCambioDeMoneda.getInstance().realizarCambio("Euro", "Dolar", cantidad);
        String[] extractos = EmpresaCambioDeMoneda.getInstance().imprimirExtracto("Libre Cambio", nombre, "€", "$", cantidad, nuevaCantidad);
        System.out.println(extractos[0]);
        System.out.println(extractos[1]);

    }

}
