package command.juego;


public class ModoDefensa implements ICommand {

    private Jugador jugador;

    public ModoDefensa(Jugador jugador) {

        this.jugador = jugador;

    }

    @Override

    public void execute() {

        System.out.println("Ejecutando acción: Modo defensa...");
        jugador.modoDefensa();


    }



}
