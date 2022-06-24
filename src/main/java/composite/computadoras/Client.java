package composite.computadoras;

public class Client {

    public static void main(String[] args) {

        Computer computer1 = new Computer("Computer",  "Asus", "Potente");
        Computer computer2 = new Computer("Computer","Acer", "Potente");
        Computer computer3 = new Computer("Computer", "Apple", "Lenta");
        Computer computer4 = new Computer("Computer","Apple", "Muy lenta");
        Computer computer5 = new Computer("Computer","Quipus", "Lenta");
        Computer computer6 = new Computer("Computer","Lenovo", "Medio");
        Computer computer7 = new Computer("Computer", "MSI", "Potente");
        Computer computer8 = new Computer("Computer", "HP", "Lenta");
        Computer computer9 = new Computer("Computer","Dell", "Media");
        Computer computer10 = new Computer("Computer",  "Razer", "Potente");
        Computer computer11 = new Computer("Computer","Samsung", "Media");
        Computer computer12 = new Computer("Computer",  "Toshiba", "Lenta");

        computer1.setSpace("\t\t\t\t");
        computer2.setSpace("\t\t\t\t");
        computer3.setSpace("\t\t\t\t");
        computer4.setSpace("\t\t\t\t");
        computer5.setSpace("\t\t\t\t");
        computer6.setSpace("\t\t\t\t");
        computer7.setSpace("\t\t\t\t");
        computer8.setSpace("\t\t\t\t");
        computer9.setSpace("\t\t\t\t");
        computer10.setSpace("\t\t\t\t");
        computer11.setSpace("\t\t\t\t");
        computer12.setSpace("\t\t\t\t");



        CompositeComputer laboratorio1 = new CompositeComputer("Laboratorio");
        CompositeComputer laboratorio2 = new CompositeComputer("Laboratorio");
        CompositeComputer laboratorio3 = new CompositeComputer("Laboratorio");
        CompositeComputer laboratorio4 = new CompositeComputer("Laboratorio");

        laboratorio1.setSpace("\t\t");
        laboratorio2.setSpace("\t\t");
        laboratorio3.setSpace("\t\t");
        laboratorio4.setSpace("\t\t");



        laboratorio1.add(computer1);
        laboratorio1.add(computer2);
        laboratorio1.add(computer3);

        laboratorio2.add(computer4);
        laboratorio2.add(computer5);
        laboratorio2.add(computer6);

        laboratorio3.add(computer7);
        laboratorio3.add(computer8);
        laboratorio3.add(computer9);

        laboratorio4.add(computer10);
        laboratorio4.add(computer11);
        laboratorio4.add(computer12);

        CompositeComputer contenedor1 = new CompositeComputer("ContenedorComputer");
        CompositeComputer contenedor2 = new CompositeComputer("ContenedorComputer");

        contenedor1.setSpace("");
        contenedor2.setSpace("");

        contenedor1.add(laboratorio1);
        contenedor1.add(laboratorio2);
        contenedor2.add(laboratorio3);
        contenedor2.add(laboratorio4);
        contenedor1.setLast(true);
        contenedor2.setLast(true);

        contenedor1.calculatePrice();
        contenedor2.calculatePrice();
        System.out.println("Precio total: " + Helper.getInstance().getPrecioGlobal());




    }

}
