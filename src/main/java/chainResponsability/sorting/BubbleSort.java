package chainResponsability.sorting;

public class BubbleSort implements IHandler{

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {

        next = handler;

    }

    @Override
    public void criteriaHandler(Persona[] personas) {

        if(personas.length <= 20) {

            Persona tmp;

            for(int i = 0; i< personas.length; i++) {

                for(int j = 1; j < personas.length-i; j++) {

                    if(personas[j-1].getEdad() > personas[j].getEdad()) {

                        tmp = personas[j-1];
                        personas[j-1] = personas[j];
                        personas[j] = tmp;

                    }

                }

            }

            System.out.println("Arreglo ordenado con BubbleSort: ");
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
