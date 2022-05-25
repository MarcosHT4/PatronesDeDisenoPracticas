package builder.pizzas;

public class Chef {

    private PizzaBuilder builder;

    public Pizza getPizzaFromBuilder() {

        return builder.getPizza();

    }

    public void setBuilder(PizzaBuilder builder) {

        this.builder = builder;

    }

    public void hornearPizza() {

        builder.createPizza();
        builder.buildIngredientes();
        builder.buildMasa();
        builder.buildQueso();

    }



}
