package builder.pizzas;

public class Client {

    public static void main(String[] args) {

        Chef chef = new Chef();

        PizzaClasica pizzaClasicaB = new PizzaClasica();

        chef.setBuilder(pizzaClasicaB);
        chef.hornearPizza();

        Pizza pizzaClasica = chef.getPizzaFromBuilder();

        PizzaCarnivora pizzaCarnivoraB = new PizzaCarnivora();

        chef.setBuilder(pizzaCarnivoraB);
        chef.hornearPizza();

        Pizza pizzaCarnivora = chef.getPizzaFromBuilder();

        PizzaHawaiana pizzaHawaianaB = new PizzaHawaiana();

        chef.setBuilder(pizzaHawaianaB);
        chef.hornearPizza();

        Pizza pizzaHawaiana = chef.getPizzaFromBuilder();

        pizzaCarnivora.showInfo();
        pizzaHawaiana.showInfo();
        pizzaClasica.showInfo();

    }

}
