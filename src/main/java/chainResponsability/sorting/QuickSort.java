package chainResponsability.sorting;

public class QuickSort implements IHandler{

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {

        next = handler;

    }

    @Override
    public void criteriaHandler(Persona[] personas) {

        if(personas.length > 50) {

            int min = 0;
            int max = personas.length-1;

            quickSort(personas, 0, personas.length-1);

            System.out.println("Arreglo ordenado con QuickSort: ");
            for (Persona p : personas) {

                p.showInfo();



            }

            System.out.println("/*/*/*/*/*/**/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");



        } else {

            next.criteriaHandler(personas);

        }




    }

    private static void quickSort(Persona[] personas, int min, int max) {

        Persona pivote = personas[min];
        int i = min;
        int j = max;
        Persona aux;

        while(i<j) {

            while(personas[i].getEdad() <= pivote.getEdad() && i < j) {

                i++;

            }

            while(personas[j].getEdad() > pivote.getEdad()) {

                j--;

            }

            if(i < j) {

                aux = personas[i];
                personas[i] = personas[j];
                personas[j] = aux;

            }

        }

        personas[min] = personas[j];
        personas[j] = pivote;

        if(min < j-1) {

            quickSort(personas, min, j-1);

        }

        if(j+1 < max) {

            quickSort(personas, j+1, max);

        }





    }




    @Override
    public IHandler next() {
        return next;
    }

}
