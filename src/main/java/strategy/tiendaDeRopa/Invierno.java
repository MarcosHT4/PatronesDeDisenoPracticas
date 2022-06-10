package strategy.tiendaDeRopa;

import java.util.List;

public class Invierno implements IEstacion {


    @Override
    public void execute(List<Ropa> listaRopa) {

        System.out.println("Estamos en época de INVIERNO!");
        System.out.println("El precio aumenta en un 10%");
        for(Ropa ropa : listaRopa) {

            int aux = ropa.getPrecio();
            ropa.setPrecio(aux + (aux*10)/100);
            ropa.showInfo();

        }

        System.out.println("Gracias por visitarnos!");
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");




    }
}
