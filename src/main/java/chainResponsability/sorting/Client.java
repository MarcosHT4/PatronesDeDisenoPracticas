package chainResponsability.sorting;

import java.util.Random;

public class Client {

    public static void main(String[] args) {

        Random r = new Random();



        Persona[] personas1 = new Persona[15];
        ManagerSorting managerSorting = new ManagerSorting();

        for(int i = 0; i < 15; i++) {

            personas1[i] = new Persona(String.valueOf(r.nextInt(50000-10000)+10000), "Dalas" + (i+1), r.nextInt(100-1) +1);

        }

        managerSorting.criteriaHandler(personas1);


        Persona[] personas2 = new Persona[40];

        for(int i = 0; i < 40; i++) {

            personas2[i] = new Persona(String.valueOf(r.nextInt(50000-10000)+10000), "Dalas" + (i+1), r.nextInt(100-1) +1);

        }

       managerSorting.criteriaHandler(personas2);

        Persona[] personas3 = new Persona[80];

        for(int i = 0; i < 80; i++) {

            personas3[i] = new Persona(String.valueOf(r.nextInt(50000-10000)+10000), "Dalas" + (i+1), r.nextInt(100-1) +1);

        }

        managerSorting.criteriaHandler(personas3);



    }

}
