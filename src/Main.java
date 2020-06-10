public class Main {

    public static void main(String[] args) {

        int [] array = {5, 0, 7, 1, 2, 4};
        InsertionSort i = new InsertionSort(array);
        i.ascendingSort();
        i.print();
        System.out.println();
        i.descendingSort();
        i.print();
    }
}
