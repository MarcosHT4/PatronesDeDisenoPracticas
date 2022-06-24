package composite.computadoras;

import java.util.ArrayList;
import java.util.List;

public class CompositeComputer extends ComputerComponent {



    private List<ComputerComponent> computerComponentList = new ArrayList<>();

    public CompositeComputer(String type) {

        super(type);

    }

    @Override
    public String showInfo() {

        return getSpace() +getType() +": \n" +getSpace()+ "-Precio: " + getPrecio() + "\n";

    }

    @Override
    public void calculatePrice() {


        for(ComputerComponent computerComponent : computerComponentList) {

            computerComponent.calculatePrice();
            this.setPrecio(this.getPrecio() + computerComponent.getPrecio());

        }
        Helper.getInstance().add(this.showInfo());


        if(isLast()) {

            Helper.getInstance().showInfo();
            Helper.getInstance().setPrecioGlobal(Helper.getInstance().getPrecioGlobal() + this.getPrecio());


        }


    }

    @Override
    public void add(ComputerComponent component) {

        computerComponentList.add(component);

    }

    @Override
    public void remove(ComputerComponent component) {

        computerComponentList.remove(component);

    }

    @Override
    public ComputerComponent getChild(int index) {
        return computerComponentList.get(index);
    }
}
