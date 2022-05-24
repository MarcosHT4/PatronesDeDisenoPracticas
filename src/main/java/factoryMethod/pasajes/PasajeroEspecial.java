package factoryMethod.pasajes;

public class PasajeroEspecial extends Pasajero {

    private String fechaNacimiento;

    public PasajeroEspecial() {

        super();

    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
