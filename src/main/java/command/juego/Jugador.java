package command.juego;

public class Jugador {

    private String nombre;
    private int nivel;
    private int vida;

    public Jugador(){}

    public String getNombre() {
        return nombre;
    }

    public Jugador setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int getNivel() {
        return nivel;
    }

    public Jugador setNivel(int nivel) {
        this.nivel = nivel;
        return this;
    }

    public int getVida() {
        return vida;
    }

    public Jugador setVida(int vida) {
        this.vida = vida;
        return this;
    }

    public void disparar() {

        System.out.println("Jugador " + nombre + " dispara!");

    }

    public void modoDefensa() {

        System.out.println("Jugador " + nombre + " activa el modo defensa!" );

    }


    public void atacar() {

        System.out.println("Jugador " + nombre + " ataca!");

    }







}
