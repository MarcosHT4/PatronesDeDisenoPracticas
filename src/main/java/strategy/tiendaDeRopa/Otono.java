package strategy.tiendaDeRopa;

import java.util.List;

public class Otono implements IEstacion {


    @Override
    public void execute(List<Ropa> listaRopa) {

        System.out.println("Estamos en época de OTOÑO!");
        System.out.println("El precio baja en un 50%");
        for(Ropa ropa : listaRopa) {

            int aux = ropa.getPrecio();
            ropa.setPrecio(aux - (aux*50)/100);
            ropa.showInfo();

        }

        System.out.println("Gracias por visitarnos!");
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");




    }
}
