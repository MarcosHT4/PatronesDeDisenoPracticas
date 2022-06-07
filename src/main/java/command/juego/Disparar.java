package command.juego;

public class Disparar implements ICommand {

    private Jugador jugador;

    public Disparar(Jugador jugador) {

        this.jugador = jugador;

    }


    @Override
    public void execute() {

        System.out.println("Ejecutando acción: Disparar...");
        jugador.disparar();

    }
}
