package visitor.paises;

public class Client {

    public static void main(String[] args) {

        LibreCambista libreCambista = new LibreCambista("Dalas");

        libreCambista.darDolares(30);
        libreCambista.darMonedaPais(300);

        Bolivia bolivia = new Bolivia();
        Brasil brasil = new Brasil();
        Argentina argentina = new Argentina();
        Italia italia = new Italia();

        bolivia.visitadoPorLibreCambista(libreCambista, EleccionDeCambio.DOLARALOCAL);
        brasil.visitadoPorLibreCambista(libreCambista, EleccionDeCambio.DOLARALOCAL);
        argentina.visitadoPorLibreCambista(libreCambista, EleccionDeCambio.DOLARALOCAL);
        italia.visitadoPorLibreCambista(libreCambista, EleccionDeCambio.DOLARALOCAL);

        bolivia.visitadoPorLibreCambista(libreCambista, EleccionDeCambio.LOCALADOLAR);
        brasil.visitadoPorLibreCambista(libreCambista, EleccionDeCambio.LOCALADOLAR);
        argentina.visitadoPorLibreCambista(libreCambista, EleccionDeCambio.LOCALADOLAR);
        italia.visitadoPorLibreCambista(libreCambista, EleccionDeCambio.LOCALADOLAR);




    }

}
