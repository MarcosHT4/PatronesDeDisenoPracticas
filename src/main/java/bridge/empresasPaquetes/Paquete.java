package bridge.empresasPaquetes;

public class Paquete {

    private String nombre;
    private String contenido;
    private double precio;

    public Paquete(String nombre, String contenido, double precio) {
        this.nombre = nombre;
        this.contenido = contenido;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void showInfo() {

        System.out.println("Paquete: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Contenido: " + contenido);
        System.out.println("Precio: " + precio);

    }

}
