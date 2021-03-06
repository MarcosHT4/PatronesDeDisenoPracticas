package builder.pizzas;

public class Pizza {

    private String[] ingredientes;
    private String tipoMasa;
    private String tipoQueso;

    public Pizza() {}

    public String[] getIngredientes() {
        return ingredientes;
    }

    public Pizza setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
        return this;
    }

    public String getTipoMasa() {
        return tipoMasa;
    }

    public Pizza setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
        return this;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public Pizza setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }

    public void showInfo() {

        System.out.print("Ingredientes: ");

        for(int i = 0; i< ingredientes.length-1; i++) {

            System.out.print(ingredientes[i] + ", ");

        }

        System.out.println(ingredientes[ingredientes.length-1]);

        System.out.println("Tipo Masa: " + tipoMasa);
        System.out.println("Tipo Queso: " + tipoQueso);
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");

    }
}
