package command.juego;

import java.util.ArrayList;
import java.util.List;

public class Jugar {

    private List<ICommand> comandosJuego = new ArrayList<>();

    public Jugar() {}

    public void addComandos(ICommand command) {

        comandosJuego.add(command);

    }

    public void ejecutarComandos() {

        for(ICommand command : comandosJuego) {

            command.execute();

        }

        comandosJuego.clear();

    }





}
