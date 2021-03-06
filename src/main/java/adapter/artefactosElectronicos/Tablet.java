package adapter.artefactosElectronicos;

public class Tablet implements IArtefactosOriginal{

    private int precio;
    private int tiempoDeVidaEnMeses;

    public Tablet(int precio, int tiempoDeVidaEnMeses) {
        this.precio = precio;
        this.tiempoDeVidaEnMeses = tiempoDeVidaEnMeses;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTiempoDeVidaEnMeses() {
        return tiempoDeVidaEnMeses;
    }

    public void setTiempoDeVidaEnMeses(int tiempoDeVidaEnMeses) {
        this.tiempoDeVidaEnMeses = tiempoDeVidaEnMeses;
    }

    @Override
    public void precio() {

        System.out.println("El precio de la tablet es de: " + precio + "$");

    }

    @Override
    public void tiempoDeVida() {

        System.out.println("El tiempo de vida de la tablet es de: " + tiempoDeVidaEnMeses + " meses");

    }
}
