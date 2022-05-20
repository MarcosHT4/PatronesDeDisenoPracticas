package singleton.cambioDeMoneda;

public class EmpresaCambioDeMoneda {

    private static EmpresaCambioDeMoneda instance;

    private EmpresaCambioDeMoneda() {

        System.out.println("Creando empresa...");

    }

    public static EmpresaCambioDeMoneda getInstance() {

        if(instance == null) {

            instance = new EmpresaCambioDeMoneda();

        }

        return instance;

    }

    public double realizarCambio(String monedaOrigen, String monedaDestino, double cantidad) {

        double nuevaCantidad = 0;

        if(monedaOrigen.equals("Boliviano") && monedaDestino.equals("Dolar")) {

            nuevaCantidad = cantidad/6.88;

        } else if(monedaOrigen.equals("Dolar") && monedaDestino.equals("Boliviano")) {

            nuevaCantidad = cantidad*6.88;

        } else if(monedaOrigen.equals("Boliviano") && monedaDestino.equals("Euro")) {

            nuevaCantidad = cantidad/7.29;


        } else if(monedaOrigen.equals("Euro") && monedaDestino.equals("Boliviano")) {

            nuevaCantidad = cantidad*7.29;

        } else if(monedaOrigen.equals("Dolar") && monedaDestino.equals("Euro")) {

            nuevaCantidad = cantidad*0.94;

        } else {

            nuevaCantidad = cantidad/0.94;

        }

        return nuevaCantidad;


    }

    public String[] imprimirExtracto(String lugar,String nombre, String monedaOrigen, String monedaDestino, double cantidad, double nuevaCantidad) {

        String preExtracto = "";
        String extracto = "";

        String cantidadFinal = String.format("%.2f", nuevaCantidad);

        preExtracto = "Extracto " + lugar + ": " + nombre;

        extracto = lugar + "<-----------" + cantidad + monedaOrigen + "---------->" + cantidadFinal + monedaDestino;

        return new String[]{preExtracto, extracto};





    }

}
