package strategy.tiendaDeRopa;

import java.util.ArrayList;
import java.util.List;


public class TiendaDeRopa {

    private List<Ropa> ropas = new ArrayList<>();

    private List<Integer> preciosOriginales = new ArrayList<>();
    private IEstacion estacion;

    public IEstacion getEstacion() {
        return estacion;
    }

    public TiendaDeRopa() {

        estacion = new Primavera();

    }

    public void setEstacion(IEstacion estacion) {
        this.estacion = estacion;
    }



    public void addRopa(Ropa ropa) {

        ropas.add(ropa);
        preciosOriginales.add(ropa.getPrecio());
    }

    public void verificarEstacion() {

        estacion.execute(ropas);
        for(int i = 0; i< ropas.size(); i++) {

            ropas.get(i).setPrecio(preciosOriginales.get(i));

        }

    }

}
