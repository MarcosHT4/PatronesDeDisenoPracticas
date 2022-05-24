package factoryMethod.pasajes;

public class Avion {

    private String marca;
    private int capacidad;
    private String modelo;
    private int nroDeAsientos;

    public Avion() {}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNroDeAsientos() {
        return nroDeAsientos;
    }

    public void setNroDeAsientos(int nroDeAsientos) {
        this.nroDeAsientos = nroDeAsientos;
    }
}
