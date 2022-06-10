package strategy.tiendaDeRopa;

import java.util.List;

public class Primavera implements IEstacion {


    @Override
    public void execute(List<Ropa> listaRopa) {

        System.out.println("Estamos en época de PRIMAVERA!");
        System.out.println("El precio se mantiene");
        for(Ropa ropa : listaRopa) {

            ropa.showInfo();

        }

        System.out.println("Gracias por visitarnos!");
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");




    }
}
