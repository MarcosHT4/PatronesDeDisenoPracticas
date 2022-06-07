package command.juego;

public class Atacar implements ICommand{

    private Jugador jugador;

    public Atacar(Jugador jugador) {

        this.jugador = jugador;

    }

    @Override
    public void execute() {

        System.out.println("Ejecutando acción: Atacar...");
        jugador.atacar();


    }

}
