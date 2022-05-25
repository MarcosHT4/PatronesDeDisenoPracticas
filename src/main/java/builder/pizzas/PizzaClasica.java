package builder.pizzas;

public class PizzaClasica extends PizzaBuilder {
    @Override
    public void buildIngredientes() {

        pizza.setIngredientes(new String[]{"Salsa Tomate", "Otro"});


    }

    @Override
    public void buildMasa() {

        pizza.setTipoMasa("Masa Especial");

    }

    @Override
    public void buildQueso() {

        pizza.setTipoQueso("Doble Queso Mozarella Tipo 2");

    }
}
