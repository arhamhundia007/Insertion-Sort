public class InsertionSort {
    int [] array;

    public InsertionSort(int [] arr){
        this.array = arr;
    }

    public void ascendingSort(){
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && key < array[j]){
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public void descendingSort(){
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && key > array[j]){
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
