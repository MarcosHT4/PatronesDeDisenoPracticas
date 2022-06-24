package composite.computadoras;

public abstract class ComputerComponent {

    private int precio;

    private String type;
    private String space;

    private boolean last;

    public ComputerComponent(String type) {

        this.type = type;

    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public abstract String showInfo();
    public abstract void calculatePrice();


    public abstract void add(ComputerComponent component);
    public abstract void remove(ComputerComponent component);
    public abstract ComputerComponent getChild(int index);



}
