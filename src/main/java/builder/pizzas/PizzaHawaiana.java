package builder.pizzas;

public class PizzaHawaiana extends PizzaBuilder {
    @Override
    public void buildIngredientes() {

        pizza.setIngredientes(new String[]{"Piña", "Salsa Tomate", "Otro"});

    }

    @Override
    public void buildMasa() {

        pizza.setTipoMasa("Masa Normal");

    }

    @Override
    public void buildQueso() {

        pizza.setTipoQueso("Queso Mozarella Tipo 2");

    }
}
