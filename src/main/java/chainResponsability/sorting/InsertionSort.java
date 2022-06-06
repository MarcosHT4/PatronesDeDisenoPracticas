package chainResponsability.sorting;

public class InsertionSort implements IHandler{

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {

        next = handler;

    }

    @Override
    public void criteriaHandler(Persona[] personas) {

        if(personas.length > 20 && personas.length <=50) {


            for(int j = 1; j< personas.length; j++) {

                Persona llave = personas[j];
                int i = j-1;

                while((i>-1) && (personas[i].getEdad() > llave.getEdad())) {

                    personas[i+1] = personas[i];
                    i--;

                }

                personas[i+1] = llave;


            }

            System.out.println("Arreglo ordenado con InsertionSort: ");
            for (Persona p : personas) {

                p.showInfo();



            }

            System.out.println("/*/*/*/*/*/**/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");

        } else {

            next.criteriaHandler(personas);

        }




    }

    @Override
    public IHandler next() {
        return next;
    }

}
