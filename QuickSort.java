class QuickSort {
    public void sort(Student[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(Student[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private int partition(Student[] array, int low, int high) {
        double pivot = array[high].getMarks();
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j].getMarks() <= pivot) {
                i++;
                // Swap
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Swap the pivot element
        Student temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
