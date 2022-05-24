package factoryMethod.pasajes;

public abstract class Lugar {

    private String pais;
    private String ciudad;
    private String aereopuerto;

    public String getPais() {
        return pais;
    }

    public Lugar() {}

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAereopuerto() {
        return aereopuerto;
    }

    public void setAereopuerto(String aereopuerto) {
        this.aereopuerto = aereopuerto;
    }
}
