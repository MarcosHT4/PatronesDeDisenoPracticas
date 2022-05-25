package builder.pizzas;

public abstract class PizzaBuilder {

    protected Pizza pizza;

    public Pizza getPizza() {

        return pizza;

    }

    public void createPizza() {

        this.pizza = new Pizza();

    }

    public abstract void buildIngredientes();

    public abstract void buildMasa();

    public abstract void buildQueso();

}
