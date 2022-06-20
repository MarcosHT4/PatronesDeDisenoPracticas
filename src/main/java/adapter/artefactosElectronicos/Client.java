package adapter.artefactosElectronicos;

public class Client {

    public static void main(String[] args) {

        IArtefactosOriginal computadora = new Computadora(400, 24);
        computadora.precio();
        computadora.tiempoDeVida();
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");
        IArtefactosOriginal tablet = new Tablet(200, 12);
        tablet.precio();
        tablet.tiempoDeVida();
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");
        IArtefactosOriginal celular = new Celular(600, 4);
        celular.precio();
        celular.tiempoDeVida();
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

        IArtefactosOriginal televisor = new AdaptadorArtefactosAdquiridos(new Televisor(400, 6));
        televisor.precio();
        televisor.tiempoDeVida();
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");
        IArtefactosOriginal lavadora = new AdaptadorArtefactosAdquiridos(new Lavadora(1500, 36));
        lavadora.precio();
        lavadora.tiempoDeVida();
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");
        IArtefactosOriginal refrigerador = new AdaptadorArtefactosAdquiridos(new Refrigerador(3500, 18));
        refrigerador.precio();
        refrigerador.tiempoDeVida();



    }

}
