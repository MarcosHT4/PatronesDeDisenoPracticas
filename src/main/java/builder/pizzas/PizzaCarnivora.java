package builder.pizzas;

public class PizzaCarnivora extends PizzaBuilder {
    @Override
    public void buildIngredientes() {

        pizza.setIngredientes(new String[]{"Carne", "Salsa Tomate", "Otro"});

    }

    @Override
    public void buildMasa() {

        pizza.setTipoMasa("Masa Especial");

    }

    @Override
    public void buildQueso() {

        pizza.setTipoQueso("Queso Mozarella");

    }
}
