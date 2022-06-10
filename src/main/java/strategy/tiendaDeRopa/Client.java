package strategy.tiendaDeRopa;

public class Client {

    public static void main(String[] args)  {

        TiendaDeRopa tiendaDeRopa = new TiendaDeRopa();

        tiendaDeRopa.addRopa(new Ropa("Polera", 100));
        tiendaDeRopa.addRopa(new Ropa("Camisa", 300));
        tiendaDeRopa.addRopa(new Ropa("Pantalon", 150));
        tiendaDeRopa.addRopa(new Ropa("Shorts", 50 ));
        tiendaDeRopa.addRopa(new Ropa("Zapatos", 400));


        tiendaDeRopa.verificarEstacion();

        tiendaDeRopa.setEstacion(new Invierno());

        tiendaDeRopa.verificarEstacion();

        tiendaDeRopa.setEstacion(new Verano());

        tiendaDeRopa.verificarEstacion();

        tiendaDeRopa.setEstacion(new Otono());

        tiendaDeRopa.verificarEstacion();

    }

}
