package command.juego;

public class Client {

    public static void main(String[] args) {

        Jugar jugar = new Jugar();

        Jugador jugador = new Jugador();

        jugador.setNombre("Dalas").setVida(100).setNivel(45);

        Disparar disparar = new Disparar(jugador);
        ModoDefensa modoDefensa = new ModoDefensa(jugador);
        Atacar atacar = new Atacar(jugador);

        jugar.addComandos(disparar);
        jugar.addComandos(modoDefensa);
        jugar.addComandos(atacar);

        jugar.ejecutarComandos();

    }

}
