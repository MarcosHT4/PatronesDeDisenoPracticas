package composite.computadoras;

public class Computer extends ComputerComponent {

    private String marca;
    private String rendimiento;





    public Computer(String type, String marca, String rendimiento) {
        super(type);
        setPrecio(100);
        this.marca = marca;
        this.rendimiento = rendimiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(String rendimiento) {
        this.rendimiento = rendimiento;
    }



    @Override
    public String showInfo() {

        return getSpace() + getType()+": \n" + getSpace() + "-Precio: " + getPrecio() + "\n" +getSpace()+ "-Marca: " + getMarca() + "\n"+getSpace() + "-Rendimiento: " + getRendimiento() + "\n";

    }

    @Override
    public void calculatePrice() {


        Helper.getInstance().add(this.showInfo());



    }

    @Override
    public void add(ComputerComponent component) {

    }

    @Override
    public void remove(ComputerComponent component) {

    }

    @Override
    public ComputerComponent getChild(int index) {

        return null;

    }
}
