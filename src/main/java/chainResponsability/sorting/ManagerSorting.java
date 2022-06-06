package chainResponsability.sorting;

public class ManagerSorting implements  IHandler{

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {

        next = handler;

    }

    @Override
    public void criteriaHandler(Persona[] personas) {

        BubbleSort bubbleSort = new BubbleSort();
        this.setNext(bubbleSort);
        InsertionSort insertionSort = new InsertionSort();
        bubbleSort.setNext(insertionSort);
        QuickSort quickSort = new QuickSort();
        insertionSort.setNext(quickSort);

        this.next.criteriaHandler(personas);

    }

    @Override
    public IHandler next() {
        return next;
    }
}
