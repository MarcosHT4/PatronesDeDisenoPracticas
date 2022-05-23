package abstractFactory.pasajes;

public class PasajeroEspecial extends Pasajero {

    private String fechaDeNacimiento;

    public PasajeroEspecial() {

        super();

    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}
